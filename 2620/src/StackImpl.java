import java.util.ArrayList;
import java.util.List;

public class StackImpl {
    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        System.out.println("The stack is empty: " + stack.isEmpty());
        System.out.println("Push to stack: " + 3);
        stack.push(3);
        System.out.println("Push to stack: " + 2);
        stack.push(2);
        System.out.println("Push to stack: " + 1);
        stack.push(1);
        System.out.println("Peek of stack: " + stack.peek());
        System.out.println("Pop from stack: " + stack.pop());
        System.out.println("Pop from stack: " + stack.pop());
        System.out.println("Pop from stack: " + stack.pop());
        System.out.println("Pop from stack: " + stack.pop());
    }
    private List<Integer> list = new ArrayList<>();
    public void push(Integer value) {
        list.add(value);
    }

    public Integer pop() {
        if (isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }

    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
