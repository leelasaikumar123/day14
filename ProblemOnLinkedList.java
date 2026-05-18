public class ProblemOnLinkedList {
    public static void main(String[] args) {
      LinkedList list=new LinkedList();
    //    list.addNodeAtStart(70);
    //   list.addNodeAtStart(30);
    //   list.addNodeAtStart(56); 
    list.insertionOf30InBetween(56);
    list.insertionOf30InBetween(70);
    list.insertionOf30InBetween(30);
    System.out.println("Before Inserting  40");
    list.printLinkedList();
    list.insertionOf40InBetween(40);
        System.out.println("After Inserting  40");
    list.printLinkedList();
    // System.out.println("Before Deletion");
    // list.searchForANode(30);
    //   list.printLinkedList();  
    //   System.out.println("Ater Deletion");
    //   list.removeStartNode();
    // list.removeEndNode();
    //   list.printLinkedList(); 
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
       System.out.println();
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
    public void addNodeAtEnd(int data){
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
        public void insertionOf40InBetween(int data){
         Node node=new Node(data);
        if(head==null){
        head=node;
        return;
        }
     if(data==40){
        Node cur1=head;
    Node cur2=head;
    while(cur1 != null && cur1.data != 30){
      cur1=cur1.next;
      
    }
    while( cur2 != null && cur2.data != 70 ){
      cur2=cur2.next;
    }
    node.next=cur2;
    cur1.next=node;
    return;
     }
     if(head !=null){
             Node curr=head;
            while(curr.next != null){
                curr=curr.next;
            }
            curr.next=node;
     }
    }
    public void insertionOf30InBetween(int data){
         Node node=new Node(data);
        if(head==null){
        head=node;
        return;
        }
     if(data==30){
        Node cur1=head;
    Node cur2=head;
    while(cur1 != null && cur1.data != 56){
      cur1=cur1.next;
      
    }
    while( cur2 != null && cur2.data != 70 ){
      cur2=cur2.next;
    }
    node.next=cur2;
    cur1.next=node;
    return;
     }
     if(head !=null){
             Node curr=head;
            while(curr.next != null){
                curr=curr.next;
            }
            curr.next=node;
     }
    }
    public void removeStartNode(){
        if(head.next==null){
            head=null;
        }
        else{
            Node curr=head;
            head=head.next;
            curr.next=null;
        }
    }
    public void removeEndNode(){
       if(head.next==null){
            head=null;
        }
        else {
            Node curr=head;
            while(curr.next.next != null){
                curr=curr.next;
            }
            curr.next=null;
        } 
    }
    public void searchForANode(int data){
        boolean flag=true;
        Node curr=head;
        while(curr != null){
            if(curr.data==data){
                flag=false;
                System.out.println("Linked List contains the number you are searching for");
            }
            curr=curr.next;
        }
        if(flag){
          System.out.println("The node you are looking for isnot available");
        }
    }
}
