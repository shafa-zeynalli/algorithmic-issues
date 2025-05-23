package custom_list;

public class CustomLinkedList {
    private Node root;
    private Node last;

    public void add(int data){
        Node newNode = new Node(data) ;

        if(root == null){
            root=newNode;
            last=newNode;
        }else{
            last.next=newNode;
            last=newNode;
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
                if(current.data < data && current.next.data > data){
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
        if (root==null) {
            System.out.println("null");
            return;
        }
        Node list=root;

        while (list.next!=null){
            System.out.println(list.data + ",");
            list=list.next;
        }
        System.out.println(list.data);
    }

    public void update(int newData, int oldData){
        if (root==null) {
            System.out.println("null");
            return;
        }
        Node current = root;

        while (current != null){
            if(current.data == oldData){
                current.data = newData;
                return;
            }
            current=current.next;
        }
        System.out.println("yoxdu");
    }
    public void delete(int data){
        if (root==null) {
            System.out.println("null");
            return;
        }
        if (root.data==data) {
            root = root.next;
            if (root==null) last=null;
            return;
        }
        Node current = root;

        while (current != null){
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current=current.next;
        }
        System.out.println("yoxdu");
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
