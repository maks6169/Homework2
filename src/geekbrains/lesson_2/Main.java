package geekbrains.lesson_2;

public class Main {

    public static void main(String[] args) {

        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
        zad6();

    }
    //Задание 1.

    private static void zad1() {
        int[] arr1 = new int[10];
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr1[i] = 1;
            }
            System.out.println("arr =" + arr1[i]);
        }
    }

    //Задание 2.

    private static void zad2() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.println(arr[i]);
                i = i + 1;
            }
            arr[i] = arr[i - 1] + 3;
            System.out.println(arr[i]);

        }
    }

    //Задание 3.

    private static void zad3() {
        int i = 0;
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.println(arr[i]);
        }
    }

    //Задание 4.

    private static void zad4() {
        int i = 0;
        int[][] arr = new int[5][5];
        for (i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][4 - i] = 1;
        }
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                System.out.print(arr[y][x] + " ");
            }
            System.out.println();
        }
    }

    //Задание 5.

    private static void zad5() {

        int[] arr = {7, 5, 3, 2, 1198, 0, -50, 2, 4, 8, 9, 1};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (max < arr[i + 1]) {
                max = arr[i + 1];
            }
            if (min > arr[i + 1]) {
                min = arr[i + 1];
            }
            {
            }
        }
        System.out.println("max = " + max + " min = " + min);
    }

    //Задание 6.

    private static void zad6() {
        int sum1 = 0;
        int sum2 = 0;
        int[] arr = {3, 5, 3, -4, 1, 6};
        for (int a = 0; a < arr.length - 1; a++) {
            sum1 = 0;
            sum2 = 0;
            for (int i = 0; i < arr.length - a - 1; i++) {
                sum1 += arr[i];
            }
            for (int j = arr.length - 1; j > arr.length - a - 2; j--) {
                sum2 += arr[j];
            }

            if (sum1 == sum2) {
                System.out.println(true);
            }
        }
    }
}
