public class Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result = a / b; // ❌ Division by zero
        System.out.println("Result: " + result);

        // ❌ Unused variable
        String name = "CodacyDemo";

        // ❌ Bad practice: empty catch block
        try {
            int[] arr = new int[2];
            System.out.println(arr[5]);
        } catch (Exception e) {
        }

        // ❌ Repeated code (duplication)
        System.out.println("Error test");
        System.out.println("Error test");
    }
}
