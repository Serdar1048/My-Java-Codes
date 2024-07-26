package stack;

public class StackItem {
    private StackItem next;
    private Object item;

    public StackItem(Object item) {
        this.item = item;
    }

    public StackItem getNext() {
        return next;
    }

    public void setNext(StackItem next) {
        this.next = next;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}
