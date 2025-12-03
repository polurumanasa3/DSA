import java.util.HashMap;

public class Map {//hashmap twosum code
    public static void main(String[] args) {
        int[] arr = {9, 5, 4, 3, 2, 6, 5, 4, 3, 1};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];
            if (map.containsKey(temp)) {
                System.out.println("Pair found: (" + arr[i] + ", " + temp + ")");
            }

            map.put(arr[i], i);
        }
    }
}