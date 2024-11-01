import java.util.Scanner;

public class LinkedListDriver {
    public static void main(String[] args) {
        int i=1;
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        do{
            System.out.println();
            System.out.println("======LinkedList=====");
            System.out.println("0.Exit ");
            System.out.println("1.Display ");
            System.out.println("2.Add ");
            System.out.println("3.Add On First ");
            System.out.println("4.Add On Last ");
            System.out.println("5.Add On Index ");
            System.out.println("6.Get first element ");
            System.out.println("7.Get last element ");
            System.out.println("8.Get element by index");
            System.out.println("9.Remove first element ");
            System.out.println("10.Remove last element ");
            System.out.println("11.Remove element by index");
            System.out.println("12.Remove All elements");
            System.out.println("13.Update first element ");
            System.out.println("14.Update last element ");
            System.out.println("15.Update element by index");
            System.out.println("16.No. of total element");
            System.out.println("17.Check List is empty or not");
            System.out.println("18.Check specific elements present in the list");
            System.out.println("19.Get the index of an element");

            System.out.print(">> ");
            int n = sc.nextInt();
            switch (n) {
                case 0 -> i=0; 
                case 1 -> list.display();
                case 6 -> System.out.println(list.getFirst());
                case 7 -> System.out.println(list.getLast());
                case 9 -> System.out.println("Removed "+list.removeFirst());
                case 10 -> System.out.println("Removed "+list.removeLast());
                case 12 -> list.removeAll();
                case 16 -> System.out.println("Total elements: "+list.length());
                case 17 -> System.out.println(list.isEmpty()?"List is Empty":"List is not Empty");

                case 2,3,4,5,13,14,15,18,19->
                {
                    System.out.print("Enter element: ");
                    int data = sc.nextInt();

                    if(n==2)list.add(data);
                    else if(n==3)list.addFirst(data);
                    else if(n==4)list.addLast(data);
                    else if(n==5 || n==15){
                        System.out.print("Enter index(start from 0): ");
                        int ind = sc.nextInt();
                        
                        if(n==5) list.add(data,ind);
                        else if(n==15) System.out.println("Updated to "+list.update(data,ind));
                    }
                    if(n==13)System.out.println("Updated to "+list.updateFirst(data));
                    else if(n==14)System.out.println("Updated to "+list.updateLast(data));
                    else if(n==18) System.out.println(list.contains(data)?data+" found!":data+" not found!");
                    else if(n==19) System.out.println(data+" present on index: "+list.indexOf(data));
                }

                case 8,11 ->{
                    System.out.print("Enter index(start from 0): ");
                    int ind = sc.nextInt();
                    if(n==8) System.out.println(list.get(ind));
                    else if(n==11) System.out.println("Removed "+list.remove(ind));
                }
                
                default-> System.out.println("Invalid! input, try again");
            }

        }while(i>0);
    }
}
