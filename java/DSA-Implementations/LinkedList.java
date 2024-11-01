public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        System.out.println(data + " added successfully");
    }

    public void add(int data,int index) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node nextNode = head;
            Node preNode = null;
            int count=0;
            while (nextNode.next != null) {
                if(index-1 == count) preNode = nextNode;
                if(index==count) break;
                nextNode = nextNode.next;
                count++;
            }
            preNode.next = node;
            node.next = nextNode;
        }
        System.out.println(data + " added successfully");
    }


    
    public void addFirst(int data){
        Node node = new Node(data);
        if(head==null){
            head = node;
        }else{
            node.next = head;
            head = node;
        }
        System.out.println(data + " added successfully");
    }

    public void addLast(int data){
        add(data);
    }

    public int getFirst(){
        if(head==null){
            System.out.println("List is empty");
            return 0;
        }
        return head.data;
    }

    public int getLast(){
        Node pointer = head;
        if(head==null){
            System.out.println("List is empty");
            return 0;
        }else{
            while(pointer.next!=null){
                pointer = pointer.next;
            }
        }
        return pointer.data;
    }

    public int get(int index){
        Node pointer = head;
        if(head==null){
            System.out.println("List is empty");
            return 0;
        }else{
            int count = 0;
            while(pointer.next!=null){
                if(count==index) break;
                pointer = pointer.next;
                count++;
            }
        }
        return pointer.data;
    }

    public int removeFirst(){
        Node pointer = head;
        if(head==null){
            System.out.println("List is empty");
        }else{
            head = pointer.next;
        }
        return pointer.data;
    }

    public int removeLast(){
        Node pointer = head;
        if(head==null){
            System.out.println("List is empty");
        }else{
            Node preNode = pointer;
            while (pointer.next!=null) {
                preNode = pointer;
                pointer = pointer.next;
            }
            preNode.next = null;
        }
        return pointer.data;
    }

    public int remove(int index){
        Node pointer = head;
        if(head==null){
            System.out.println("List is empty");
        }else{
            Node preNode = pointer;
            int count = 0;
            while (pointer.next!=null) {
                if(count == index-1) preNode = pointer;
                if(count == index) break;
                pointer = pointer.next;
                count++;
            }
            preNode.next = pointer.next;
        }
        return pointer.data;
    }

    public void removeAll(){
        head = null;
        System.out.println("All elements are deleted");
    }

    public int updateFirst(int data){
        Node node = new Node(data);
        if(head==null){
            head = node;
        }else{
            head.data = data;
        }
        return head.data;
    }

    public int updateLast(int data){
        Node node = new Node(data);
        Node pointer = head;
        if(head==null){
            head = node;
        }else{
            while(pointer.next!=null){
                pointer = pointer.next;
            }
            pointer.data = data;
        }
        return pointer.data;
    }

    public int update(int data, int index){
        Node node = new Node(data);
        Node pointer = head;
        if(head==null){
            head = node;
        }else{
            int count = 0;
            while(pointer.next!=null){
                if(count==index) break;
                pointer = pointer.next;
                count++;
            }
            pointer.data = data;
        }
        return pointer.data;
    }

    public int length(){
        int count=0;
        if(head==null) return 0;
        else{
            Node pointer = head;
            while(pointer!=null){
                pointer = pointer.next;
                count++;
            }
        }
        return count;
    }
    
    public boolean isEmpty(){
        if(head==null) return true;
        return false;
    }

    public boolean contains(int data){
        Node pointer = head;
        if(head==null) System.out.println("List is empty");
        else{
            while(pointer!=null){
                if(pointer.data==data) return true;
                pointer = pointer.next;
            }
        }
        return false;
    }

    public int indexOf(int data){
        Node pointer = head;
        int count=0;
        if(head==null) System.out.println("List is empty");
        else{
            while(pointer!=null){
                if(pointer.data==data) return count;
                pointer = pointer.next;
                count++;
            }
        }
        return count;
    }

    public void display() {
        Node pointer = head;
        if (pointer == null) {
            System.out.println("List is empty");
        } else {
            System.out.print("LinkedList:");
            while (pointer != null) {
                System.out.print(" " + pointer.data);
                pointer = pointer.next;
            }
            System.out.println(); 
        }
    }
}
