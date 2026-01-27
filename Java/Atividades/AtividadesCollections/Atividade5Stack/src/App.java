import java.util.ArrayDeque;
import java.util.Deque;

public class App {
    public static void main(String[] args) throws Exception {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(6);
        stack.push(14);
        stack.push(9);

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());

    }
}