public class StackDS {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addNode(70);
        list.addNode(30);
        list.addNode(56);
        System.out.println("The Stack is ");
        list.displayLinkedList();
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
        node.next=head;
        head=node;
    }
    }
    public void displayLinkedList(){
        Node curr=head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
