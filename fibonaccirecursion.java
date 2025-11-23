import java.util.Scanner;

public class fibonaccirecursion {

    static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print(fib(i) + " ");
        }
        sc.close();
    }
}
