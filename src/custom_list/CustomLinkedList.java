package custom_list;

public class CustomLinkedList {
    private Node root;

    public void add(int data){
        Node newNode = new Node(data) ;

        if(root == null){
            root=newNode;
        }else{
            Node current=root;
            while(current.next != null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    //bu metod artan sira ile elave olunur artiq eger artan sirada list saxlamaq isteyirikse bu metodu istfde edcem.
    public void insert(int data){
        Node newNode = new Node(data) ;

        if(root == null || root.data>data){
            newNode.next=root;
            root=newNode;
        }else{
            Node current=root;
            boolean isPresent=false;

            while(current.next != null){
                if(current.data<data && current.next.data>data){
                    newNode.next=current.next;
                    current.next=newNode;
                    isPresent=true;
                }
                current=current.next;
            }
            if (!isPresent){
                current.next=newNode;
            }
        }
    }
    public void allList(){
        Node list=root;

        while (list.next!=null){
            System.out.println(list.data + ",");
            list=list.next;
        }
        System.out.println(list.data);
    }
}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
