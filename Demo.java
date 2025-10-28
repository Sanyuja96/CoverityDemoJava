public class BuggyExample {

    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        // ❌ Division by zero (Bug risk)
        int result = x / y;

        // ❌ Unused variable
        String password = "12345"; // ❌ Hardcoded credential (Security issue)

        // ❌ Empty catch block
        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
        }

        // ❌ Code duplication
        System.out.println("Debugging...");
        System.out.println("Debugging...");

        // ❌ Magic number (Best practice)
        if (x == 42) {
            System.out.println("The answer!");
        }

        // ❌ Poor formatting (Code style)
          int   badIndent =   5;
        System.out.println("Bad indent: " + badIndent);
    }
}

