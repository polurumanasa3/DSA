public class Charreplace {
    public static void main(String[] args) {
        String str = "Prasanna";
        String result = linearSearch(str);
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + result);
    }

    public static String linearSearch(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                result += '*';  
            } else {
                result += str.charAt(i); 
            }
        }

        return result;
    }
}