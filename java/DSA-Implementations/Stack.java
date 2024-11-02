public class Stack {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void push(int data){
        Node node = new Node(data);
        if(head==null) head = node;
        else{
            node.next = head;
            head = node;
        }
        System.out.println(data+" added successfully");
    }

    public int pop(){
        int data=0;
        if(head==null) System.out.println("Stack is empty!");
        else{
            data = head.data;
            head = head.next;
        }
        return data;
    }

    public int peek(){
        int data=0;
        if(head==null) System.out.println("Stack is empty!");
        else data = head.data;
        return data;
    }

    public void clear(){
        head=null;
        System.out.println("Stack is cleared!");
    }

    public boolean contains(int data){
        if(head==null) System.out.println("Stack is empty!");
        else{
            Node pointer = head;
            while(pointer!=null){
                if(pointer.data == data) return true;
                pointer = pointer.next;
            }
        }
        return false;
    }

    public int search(int data){
        int index = -1;
        int count = 1;
        if(head==null) System.out.println("Stack is empty!");
        else{
            Node pointer = head;
            while(pointer!=null){
                if(pointer.data == data){
                    return count;
                } 
                pointer = pointer.next;
                count++; 
            }
        }
        return index;
    }

    public int size(){
        int count=0;
        Node pointer = head;
        while(pointer!=null){
            pointer = pointer.next;
            count++;
        }
        return count;
    }

    public boolean isEmpty(){
        if(head==null) return true;
        return false;
    }
}
