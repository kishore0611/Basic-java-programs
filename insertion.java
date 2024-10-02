import java.util.*;
class Linkedlist{
    Node head;
    
    class Node{
        int data;
        Node next;
        //Node head;
        
        Node(int val){
            data = val;
            next = null;
            //head = null;
        }
    }
    Linkedlist(){
        head = null;
    }
    public void insertend(int val){
        Node newnode = new Node(val);

        if (head==null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp =  temp.next;       
            }
            temp.next = newnode;
            
        }
    }
    public void position(int pos , int k){
        Node newnode = new Node(k);
        
        Node temp = head;
        
        for (int i =1;i<pos;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public void insertbegin(int s){
        Node newnode = new Node(s);
       
        if (head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode; 
        }
}
    public void display(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Linkedlist list = new Linkedlist();

        int m = sc.nextInt();
        for (int i =0 ;i<m;i++){
            int val = sc.nextInt();
            list.insertend(val);
        }
        System.out.print("insert begin:");
        list.display();
        int pos=sc.nextInt();
        int k=sc.nextInt();
        System.out.print("index position:"+pos);
        System.out.print("\nkey:"+k);
        list.position(pos,k);
        System.out.print("\ninsert position:");
        list.display();
        int s = sc.nextInt();
        System.out.print("insert value:");
        list.insertbegin(s);
        list.display();
    }
}

