import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int k = scanner.nextInt();
        int numCount = 0;
        int xCopy = x;
        while (xCopy > 0) {
            numCount++;
            xCopy /= 10;
        }
        System.out.println(x / tenTimes(numCount - k));
    }

    public static int tenTimes(int times) {
        int ten = 1;
        while (times > 0) {
            ten *= 10;
            times--;
        }
        return ten;
    }
}
