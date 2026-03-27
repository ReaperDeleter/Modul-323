public class FibonacciRekursiv {

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int value = 10;
        System.out.println("Berechnen der ersten " + value + " Fibonacci-Zahlen:");

        for (int i = 1; i <= value; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}