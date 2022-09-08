import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        testReverse();
    }

    private static String reverseString(String str) {
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result += array[i];
        }
        return result;
    }

    private static void testReverse() throws Exception{
        String[] strings = {"qwerty", "asdf", "zxcv", "", "q"};
        String[] revertedStrings = {"ytrewq", "fdsa", "vcxz", "", "q"};
        for (int i = 0; i < strings.length; i++){
            if(!revertedStrings[i].equals(reverseString(strings[i]))){
                throw new Exception("Revert test failed!");
            }
        }
    }
}