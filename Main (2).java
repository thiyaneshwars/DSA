import java.util.*;
class Node {
int data;
Node next;
}
public class Main
{
public static void insert(Node head){
    Node obj = new Node();
    Scanner sc = new Scanner(System.in);
    obj.data=sc.nextInt();
    Node temp = head;
    while(temp.next!=null){
        temp=temp.next;
    }
    obj.next=temp.next;
    temp.next=obj;
}

public static void sum(Node head){
    Node temp=head;
    int val=0;
    while(temp.next!=null){
        val += temp.next.data;
        temp=temp.next;

    }
    System.out.println("Total :"+val);
}
public static void odd(Node head){
    Node temp = head;
    int total=0;
    while (temp.next!=null){
        temp =temp.next;

        if(temp.data%2!=0){
            System.out.print(temp.data+" ");
            total+=temp.data;
        }
}

System.out.print("Total elements :"+total);
}
 public static void even(Node head){
    Node temp = head;
    int total=0;
    while (temp.next!=null){
        temp =temp.next;

        if(temp.data%2==0){
             System.out.print(temp.data+" ");
            total+=temp.data;
        }
}
       
System.out.print("Total elements :"+total);
}
public static void nth(Node head){
    Node temp = head;
    while(temp.next!=null){
        temp=temp.next;
    }
    if(temp.next==null){
        System.out.print(temp.data);
    }
    
    }
public static void display(Node head){
Node temp = head;
while(temp.next!=null){
    temp=temp.next;
    System.out.print(temp.data+" ");
}
}
public static void alternate(Node head){
Node temp = head.next;
int c= 0;
int a;
while(temp!=null){
    c++;
    if(c%2!=0){
        System.out.print(c);
    }
    temp =temp.next;
}
}
public static void duplicate(Node head){
    Node temp = head;
    while (temp.next!=null){
           temp=temp.next;
        if(temp.data==temp.next.data){
            System.out.print(temp.data);
        }
        else{
            System.out.print("No Duplicate found");
        }
             
}
    }


public static void main(String[] args) {
	Node head = new Node();
	head.next=null;
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	for (int i=0;i<a;i++){
	    insert(head);
}
display(head);
System.out.println();
sum(head);
System.out.println();
odd(head);
System.out.println();
even(head);
System.out.println();
alternate(head);
System.out.println();
nth(head);
System.out.println();
duplicate(head);
}
}
