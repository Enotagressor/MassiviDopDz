import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        task4();
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
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        int[] mas = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            mas[i] = arr[(arr.length - 1) - i];
        }
        System.out.println(Arrays.toString(mas));

    }

    public static void task3() {
        int[] arr = {5, -4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
         int n;
        for (int i = 0; i < arr.length/2; i++) {
            n = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = n;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void task4(){
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int sum = -2;
        int a = 0;
        int b = arr.length -1;
        while (a != b) {
            int c = arr[a] + arr[b];
            if (c < sum){
                a++;
            } else if (c>sum) {
                b--;
            }else {
                System.out.println(arr[a] + " " + arr[b]);
                break;
            }
        }
    }
//  у меня получилось 2 варианта решения задания №9,
//  какой из них более корректен?
    public static void task5(){
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int sum = -2;
        int a = 0;
        int b = arr.length-1;
        while (a<b){
            int c = arr[a] + arr[b];
            if (c == sum) {
                System.out.println(arr[a] + " + " + arr[b] + " = " + c);
                a++;
                b--;
            } else if(c<sum){
                a++;
            } else{
                b--;
            }
        }
    }
    public static void task6(){
       int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int summ = -2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ( i != j && arr[i] + arr[j] == summ) {
                if (i < j) {
                        break;
                    }
                    System.out.println(arr[i] + " + " + arr[j] + " = " + summ);
                }
            }
        }
    }
}