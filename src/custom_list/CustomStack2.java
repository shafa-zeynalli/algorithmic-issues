package custom_list;

import java.util.Stack;

//Stack strukturu ilə Queue necə simulyasiya oluna bilər?
public class CustomStack2 {
    private Stack<Integer> inStack= new Stack<>();
    private Stack<Integer> outStack= new Stack<>();

    public void queue(int n){
        inStack.push(n);
    }

    public int dequeue(){
        if (!inStack.isEmpty()){
            while (!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }
}
