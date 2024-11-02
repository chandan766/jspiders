import java.util.Scanner;

public class QueueDriver {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int i=1;

        do{
            System.out.println();
            System.out.println("======Queue=======");
            System.out.println("0.Exit");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Get Front element");
            System.out.println("4.Queue size");
            System.out.println("5.Queue is empty");
            System.out.println("6.Clear Queue");

            System.out.print(">> ");
            int n = sc.nextInt();
            switch (n) {
                case 0 -> i=0;
                case 1 -> {
                    System.out.print("Enter a data: ");
                    int data = sc.nextInt();
                    q.enqueue(data);
                }
                case 2 -> System.out.println("Dequeue: "+q.dequeue());
                case 3 -> System.out.println("Front: "+q.front());
                case 4 -> System.out.println("Queue Size: "+q.size());
                case 5 -> System.out.println(q.isEmpty()?"Queue is empty":"Queue is not empty");
                case 6 -> q.clear();
                default -> System.out.println("Invalid! input please try again");
            }

        }while(i>0);
    }
}
