import java.util.Random;

class RandomArray {
    
    // Function to find and print sum of even & odd numbers
    static void processArray(int[] arr) {
        int even = 0, odd = 0;

        for (int n : arr) {
            if (n % 2 == 0) even += n;
            else odd += n;
        }

        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);
    }

    public static void main(String[] args) {

        Random r = new Random();
        int[] arr = new int[10];

        // Fill array with random numbers from 1–10
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10) + 1;  // 1 to 10
        }

        // Print the array
        System.out.print("Array: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        // Call the function
        processArray(arr);
    }
}
