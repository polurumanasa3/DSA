class Rotationarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;  
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = arr[i];
        }
        System.out.print("Rotated Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
