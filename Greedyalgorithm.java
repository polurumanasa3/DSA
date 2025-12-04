import java.util.Scanner;
import java.util.Arrays;

public class Greedyalgorithm {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Items:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the item values:");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Items: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the amount:");
        int num = sc.nextInt();

        // Sort the array in ascending order
        Arrays.sort(arr);

        int count = 0;
        int sum = 0;

        for(int value : arr) {
            if(sum + value <= num) {
                sum += value;
                count++;
            } else {
                break; // stop if sum exceeds num
            }
        }

        System.out.println("Maximum number of items that can be bought: " + count);
        sc.close();
    }
}

