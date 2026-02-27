public class MathDemo {

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int sum(int[] args) {
        int total = 0;
        for (int num : args) {
            total += num;
        }
        return total;
    }

    public static float mean(int[] args) {
        if (args.length == 0) {
            return 0;
        }
        return (float) sum(args) / args.length;
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /*
     * These methods are static because they don’t depend on any object data.
     * We can call them directly using the class name without creating an object.
     * It keeps things simple and makes sense for utility-style math methods.
     */
}