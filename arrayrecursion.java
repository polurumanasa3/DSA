import java.util.Scanner;

public class arrayrecursion {

    static void fillArray(int[] arr, int index, Scanner scanner) {
        if (index == arr.length) {
            return;
        }
        arr[index] = scanner.nextInt();
        fillArray(arr, index + 1, scanner);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        fillArray(arr, 0, scanner);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
