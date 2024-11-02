import java.util.Scanner;

public class StackDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack();
        int i=1;
        do{
            System.out.println();
            System.out.println("======Stack=======");
            System.out.println("0.Exit");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Get Peek element");
            System.out.println("4.Clear Stack");
            System.out.println("5.Size of Stack");
            System.out.println("6.Check element present in Stack");
            System.out.println("7.Check Stack is empty");
            System.out.println("8.Search index of element");

            System.out.print(">> ");
            int n = sc.nextInt();

            switch(n){
                case 0 -> i=0;
                case 1,6,8 ->{
                    System.out.print("Enter a data: ");
                    int data = sc.nextInt();
                    if(n==1) st.push(data);
                    if(n==6) System.out.println(st.contains(data)?data+" is present":data+" is not present");
                    if(n==8) System.out.println("Index: "+st.search(data));
                }
                case 2 -> System.out.println(st.pop());
                case 3 -> System.out.println("Peek: "+st.peek());
                case 4 -> st.clear();
                case 5 -> System.out.println("Size: "+st.size());
                case 7 -> System.out.println(st.isEmpty()?"Stack is empty":"Stack is not empty");
                default -> System.out.println("Invalid! input please try again");
            }

        }while(i>0);
    }
}
