public class RecursiveTest {
    public static void main(String[] args) {
        recursion(3);
    }

    public static void recursion(int n) {
        // Remove this condition to get a StackOverflowError!
        if (0 == n)
        {
            return;
        }
        System.out.println("Push to stack " + n);
        recursion(n - 1);
        System.out.println("After process " + n);
    }
}
