
import java.util.Properties;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class GuessNumGame {
    static Properties prop = new Properties();
    private static final String USER_HOME_DIR = System.getProperty("user.home");
    private static final String FILE_PATH = USER_HOME_DIR+"/"+"guessNumGame.properties";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String curDate = currentDate.format(format);
        System.out.print("Enter Your Name-"+((char)16+" "));
        String name = sc.next();
        while (true) {
            clrscreen();
            System.out.println("Welcome "+name.toUpperCase());
            menu(); 
            System.out.println();
            System.out.print("--"+((char)16+"")+" ");
            int opt = sc.nextInt();
            int score = 0;
            String data="";
            int rand_num = randNum();
            boolean flag=false;
            do{
                switch (opt) {
                    case 1:
                        System.out.println("Easy Level (6 chances)");
                        if(guessGame(6,rand_num)){
                            score++;
                            data = name+","+"Easy"+","+score+","+curDate;
                        }
                        break;
                    case 2:
                        System.out.println("Medium Level (4 chances)");
                        if(guessGame(4,rand_num)){
                            score++;
                            data = name+","+"Medium"+","+score+","+curDate;
                        }
                        break;
                    case 3:
                        System.out.println("Hard Level (2 chances)");
                        if(guessGame(2,rand_num)){
                            score++;
                            data = name+","+"Hard"+","+score+","+curDate;
                        }
                        break;
                    case 4:
                        scores(name);
                        break;
                    case 5:
                        about();
                        break;
                    case 6:
                        quit();
                
                    default:
                        System.out.println("Error! Select the right option(1 to 6)");
                }
                if(!data.equals("")){
                    System.out.println("**Congratulations! you successfully guess the number!");
                    System.out.println("Your current Score is "+score);
                    if (getData(name.toLowerCase())==null) {
                        saveData(name.toLowerCase(),data);
                    }
                    else if(score>Integer.valueOf(getData(name.toLowerCase()).split(",")[2])){
                        saveData(name.toLowerCase(),data);
                    }
                }
                if(opt<4){
                    System.out.println("Press 1 to countinue the game Or Press 0 for main menu");
                }else{
                    System.out.println("Press 0 for main menu");
                }
                System.out.print("--"+((char)16+"")+" ");
                int press = sc.nextInt();
                if(press==1){
                    flag=true;
                    rand_num = randNum();
                }
                else{
                    flag=false;
                }
            }while(flag);
        }
    }

    public static void menu(){
        System.out.println("-".repeat(25));
        System.out.println(((char)22+"").repeat(25));
        System.out.println(((char)30)+"\tGuess & Win\t"+((char)31));
        System.out.println(((char)22+"").repeat(25));
        System.out.println("-".repeat(25));
        
        System.out.println("|\t1. Easy  "+"\t|");
        System.out.println("|\t2. Medium"+"\t|");
        System.out.println("|\t3. Hard  "+"\t|");
        System.out.println("|\t4. Scores"+"\t|");
        System.out.println("|\t5. About "+"\t|");
        System.out.println("|\t6. Quit  "+"\t|");

        System.out.println(((char)22+"").repeat(25));
    }

    public static void clrscreen(){
        System.out.println("\033[H\033[2J");
    }

    public static int randNum(){
        return (int)(Math.random()*9)+1;
    }

    public static boolean guessGame(int chances, int randomNum){
        for(int i = 1;i<=chances;i++)
        {   Scanner scan = new Scanner(System.in);
            System.out.print("Guess the num: ");
            int num = scan.nextInt();
            if(randomNum==num){
                return true;
            }else if(i<chances){
                System.out.println("<Oops! wrong ans Try again "+(chances-i)+" more chance left>");
            }
        }
        return false;
    }

    public static void quit(){
        System.exit(0);
    }

    public static void scores(String name){
        System.out.println("-".repeat(47));
        System.out.println(((char)31)+"    Name        Level     Score     Date    "+((char)31));
        String[] arr = getData(name.toLowerCase()).split(",");
        if(arr[0].length()<12 ){
            arr[0] = arr[0]+" ".repeat(12-arr[0].length());
        }else if(arr[0].length()>12){
            arr[0] = arr[0].substring(0,10)+"..";
        }
        if(arr[1].length()<6 ){
            arr[1] = arr[1]+" ".repeat(6-arr[1].length());
        }
        if(arr[2].length()<3 ){
            arr[2] = arr[2]+" ".repeat(3-arr[2].length());
        }
        
        System.out.println("  "+arr[0]+"   "+arr[1]+"     "+arr[2]+"      "+arr[3]);
        System.out.println("-".repeat(47));
    }
    public static void about(){
        System.out.println("-".repeat(50));
        System.out.println(((char)16)+" Welcome to the Guess Number Game!");
        System.out.println(((char)16)+" This game is designed to test your guessing skills.");
        System.out.println(((char)16)+" You can choose from three difficulty levels: Easy, Medium, and Hard.");
        System.out.println(((char)16)+" Each level has a different number of chances to guess the correct number.");
        System.out.println(((char)16)+" You can view your high scores and learn more about the game in the menu.");
        System.out.println(((char)16)+" Developer: Chandan Maurya");
        System.out.println("-".repeat(50));
    }
    
    public static void saveData(String key, String data){
        prop.setProperty(key,data);
        try(FileOutputStream output = new FileOutputStream(FILE_PATH)){
            prop.store(output,"user data");
        }catch(IOException e){
            System.out.println("Error saving properties "+e.getMessage());
        }
    } 
    public static String getData(String key){
        try(FileInputStream input = new FileInputStream(FILE_PATH)){
            prop.load(input);
        }catch(IOException e){
            System.out.println("Error saving properties "+e.getMessage());
        }
        String allData = prop.getProperty(key.toLowerCase());
        return allData;
    }
}
