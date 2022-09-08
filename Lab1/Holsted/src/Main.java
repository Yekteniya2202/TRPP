public class Main {
    public static void main(String[] args) {
        String reverse = reverseString("qwerty");
        System.out.println(reverse);
    }

    private static String reverseString(String str) {
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result += array[i];
        }
        return result;
    }
}