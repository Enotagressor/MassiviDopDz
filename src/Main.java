import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task3();
    }

    public static void task1() {
        int n = 3;
        int[][] matrix = new int[n][n];
        int a = 1;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    matrix[i][j] = a;
                } else if (i % 2 != 0 && j % 2 != 0) {
                    matrix[i][j] = a;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void task2() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        int[] mas = new int[arr.length];
        for (int i = 0; i < arr.length ; i++)
        {
                mas[i] = arr[(arr.length - 1) - i];
            }
            System.out.println(Arrays.toString(mas));

    }
    public static void task3(){
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

    }
}

