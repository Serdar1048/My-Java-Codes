package stack;

import java.util.ArrayList;

public class StackArrayImpl implements Stack {
    private ArrayList<Object> stack = new ArrayList<>();
    @Override
    public void push(Object item) {
        stack.add(0, item);
        stack.addFirst(item);
    }
    @Override
    public Object pop() {
        //return stack.remove(0);
        return stack.removeFirst();
    }
    @Override
    public boolean isEmpty() {
        return stack.size() == 0;
        //return stack.isEmpty();
    }

}