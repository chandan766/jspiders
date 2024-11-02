public class Queue {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }



    public void enqueue(int data){
        Node node = new Node(data);
        if(head==null) head = node;
        else{
          Node pointer = head;
          while(pointer.next!=null){
            pointer = pointer.next;
          }
          pointer.next = node;
    
        }
    }

    public int dequeue(){
        int data=0;
        if(head==null) System.out.println("Queue is empty");
        else{
            data = head.data;
            head = head.next;
        }
        return data;
    }

    public int front(){
        int data=0;
        if(head==null) System.out.println("Queue is empty");
        else{
            data = head.data;
        }
        return data;
    }

    public boolean isEmpty(){
        if(head==null) return true;
        return false;
    }

    public int size(){
        int count=0;
        if(head==null) System.out.println("Queue is empty");
        else{
            Node pointer = head;
            while(pointer!=null){
                count++;
                pointer = pointer.next;
            }
        }
        return count;
    }

    public void clear(){
        head = null;
        System.out.println("Queue is empty");
    }
}
