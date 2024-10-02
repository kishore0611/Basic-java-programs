1.DELETION
import java.util.Scanner;
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
    public void deletebegin(){
        head = head.next;
    }public void position(int pos , int k){
        Node newnode = new Node(k);
        
        Node temp = head;
        
        for (int i =1;i<pos;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public void deleteposition(int d){
        Node temp = head;
        Node prev = null;
        
        for(int i=1;i<d;i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
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
        list.deletebegin();
        System.out.print("Delete at begin:");
        list.display();
        int pos=sc.nextInt();
        int k=sc.nextInt();
        System.out.print("index position:"+pos);
        System.out.print("\nkey:"+k);
        list.position(pos,k);
        System.out.print("\ninsert position:");
        list.display();
        int d=sc.nextInt();
        System.out.print("position for deletion:");
        list.deleteposition(d);
        System.out.print("\nDelete at position:");
        list.display();
    }
}