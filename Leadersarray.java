class Leadersarray {
    public static void main(String[] args) {
        int[] arr = {19, 10, 12, 6, 4, 3, 9, 4, 5, 3};
        int n = arr.length;

        int maxFromRight = arr[n - 1]; 
        System.out.print("Leaders: " + maxFromRight + " ");

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                System.out.print(arr[i] + " ");
                maxFromRight = arr[i]; 
            }
        }
    }
}
