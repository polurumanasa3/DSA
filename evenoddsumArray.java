 class Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example array, you can modify this
        int sumEven = 0;
        int sumOdd = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                sumEven += num;
            } else { 
                sumOdd += num;
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}
