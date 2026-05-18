package QueuePackage;

public class QueueDs {
    public static void main(String[] args) {
          LinkedList list=new LinkedList();
        list.addNode(70);
        list.addNode(30);
        list.addNode(56);
        System.out.println("The Queue is ");
        list.displayLinkedList(); 
        System.out.println();
        int queueLength=list.size();
        for(int i=0;i<queueLength;i++){
  System.out.println("Poped "+list.dequeue());
        } 
}
    }

class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
    
}
class LinkedList{
    Node head;
    void addNode(int data){
        Node node=new Node(data);
        if(head==null){
         head=node;
        }
        else{
            Node curr=head;
            while(curr.next != null){
                curr=curr.next;
            }
            curr.next=node;
        }
    }
    void displayLinkedList(){
                  Node curr=head;
            while(curr != null){
                System.out.print(curr.data+" ");
                curr=curr.next;
            }
            
    }
    public int size(){
        int length=0;
        Node curr=head;
        while(curr != null){
            length++;
            curr=curr.next;
        }
        return length;
    }
    public int dequeue(){
        if(head.next == null){
            int data=head.data;
            head=null;
            return data;
        }
        else{
            Node curr=head;
            int data=curr.data;
            head=head.next;
            curr.next=null;
    return data;
        }
    }
}
