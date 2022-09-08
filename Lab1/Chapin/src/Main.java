import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, cols;
        do{
            System.out.println("Введите число строк и столбков (>=3 И <= 10)");
            System.out.print("Строки = ");
            rows = scanner.nextInt();
            System.out.print("Столбцы = ");
            cols = scanner.nextInt();
        }while (rows < 3 || rows > 10 || cols < 3 || cols > 10);
        int [][] matrix = initMatrix(rows, cols);
        printMatrix(matrix);
        replaceMainDiagonal(matrix);
        System.out.println("==========");
        printMatrix(matrix);
    }

    private static void replaceMainDiagonal(int[][] matrix) {
        int cols = matrix[0].length;
        for (int i = 0; i < cols; i++){
            matrix[i][i] = i;
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(String.format("%3d", matrix[i][j]) + " ");
            }
            System.out.println();
        }
    }

    private static int[][] initMatrix(int rows, int cols) {
        int [][] matrixToFill = new int[rows][cols];
        Random random = new Random();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrixToFill[i][j] = random.nextInt(21) - 10;
            }
        }
        return matrixToFill;
    }
}