public class ProblemOnLinkedList {
    public static void main(String[] args) {
      LinkedList list=new LinkedList();
       list.addNodeAtStart(70);
      list.addNodeAtStart(30);
      list.addNodeAtStart(56);
     
      list.printLinkedList();  
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
    public void addNode(int data){
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
    public void printLinkedList(){
       Node curr=head;
       while(curr != null){
        System.out.print(curr.data+" ");
        curr=curr.next;
       } 
    }
    public void addNodeAtStart(int data){
     Node node=new Node(data);  
     if(head==null){
        head=node;
     } 
     else{
        node.next=head;
        head=node;
     }
    }
}
