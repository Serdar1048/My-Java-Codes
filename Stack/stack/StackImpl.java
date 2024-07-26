package stack;

public class StackImpl implements Stack {

    StackItem top = null;

    @Override
    public void push(Object item) {
        StackItem box = new StackItem(item);
        StackItem previousTop = top;
        top = box;
        top.setNext(previousTop);
    }

    @Override
    public Object pop() {
        Object topItem = top.getItem();
        top = top.getNext();
        return topItem;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
