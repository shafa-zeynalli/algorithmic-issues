package custom_list;

import java.util.ArrayList;

public class CustomStack<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void push(T data){
        list.add(data);
    }

    public T pop(){
        if (isEmpty()) return null;
        return list.remove(list.size()-1);
    }

    public T peek(){
        if (isEmpty()) return null;
        return list.get(list.size()-1);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int size(){
        return list.size();
    }
}
