import custom_list.CustomStack;
import custom_list.CustomStack2;


public class Main2 {

    public static void main(String[] args) {
        CustomStack<Integer> customStack = new CustomStack<>();
        customStack.push(6);
        customStack.push(12);
        customStack.push(8);
        System.out.println(customStack.pop());
    }

//    public static void main(String[] args) {
//        CustomStack2 customStack = new CustomStack2();
//        customStack.queue(6);
//        customStack.queue(12);
//        customStack.queue(8);
//        System.out.println(customStack.dequeue());
//    }





//    public static void main(String[] args) {
//        CustomLinkedList list = new CustomLinkedList();
//        list.insert(5);
//        list.insert(15);
//        list.insert(10);
//        list.insert(3);
//        list.insert(6);
//        list.insert(9);
//        list.insert(20);
//        list.update(12,10);
//        list.delete(3);
//        list.allList();
//    }
}
