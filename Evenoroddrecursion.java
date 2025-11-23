import java.util.Scanner;

public class Evenoroddrecursion {

    public static boolean isEven(int n) {
        if (n == 0) return true;
        if (n == 1) return false;
        if (n < 0) return isEven(-n);
        return isEven(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (isEven(num)) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
        scanner.close();
    }
}
