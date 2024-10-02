import java.util.Scanner;

class Linkedlist{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int val){
            data = val;
            next = null;
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
    public void maximum(int m)
    {
        if(head==null)
        {
            System.out.print("List is empty");
        }
        Node temp=head;
        int max=0;
        while(temp!=null)
        {
            if(temp.data>max)
            {
                max=temp.data;
            }
            temp=temp.next;
        }
        System.out.printf("\nMaximum is %d\n",max);
    }
    public void minimum(int m)
    {
        if(head==null)
        {
            System.out.print("List is empty");
        }
        Node temp=head;
        int min=10000;
        while(temp!=null)
        {
            if(temp.data<min)
            {
                min=temp.data;
            }
            temp=temp.next;
        }
        System.out.printf("\nMinimum is %d\n",min);
    }
    public void search(int key)
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                count+=1;
            }
            temp=temp.next;
        }  if(count==1)
    {
        System.out.println("\nElement found");
    }
    else {
        System.out.println("\nElement Not Found");
    }
    }
    public void reverse(){
        Node prev = null;
        Node current = head;
        while (current != null){
            Node next = current.next ;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }


    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Linkedlist list = new Linkedlist();


        int m = sc.nextInt();
        for (int i =0 ;i<m;i++){
            int val = sc.nextInt();
            list.insertend(val);
        }
        int key=sc.nextInt();

        list.maximum(m);
        list.display();
        list.minimum(m);
        list.display();
        list.search(key);
        list.display();
        System.out.print("\n");
        list.reverse();
        System.out.print("REVERSE\n");
        list.display();}}
