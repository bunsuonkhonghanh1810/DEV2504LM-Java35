import java.util.Random;
import java.util.Scanner;

public class BaiTapTuLam {
    public static void main(String[] args) {
        System.out.print("Mang: ");
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i: arr1) System.out.print(i + " ");
        System.out.println();

        Random rand = new Random();
        int[] arr2 = new int[10];

        System.out.print("Mang random: ");
        for (int i = 0; i < arr2.length; i++) arr2[i] = rand.nextInt(100);
        for (int i: arr2) System.out.print(i + " ");
        System.out.println();

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        int[] arr3 = new int[n];
        System.out.print("Mang random co n: ");
        for (int i = 0; i < arr3.length; i++) arr3[i] = rand.nextInt(100);
        for (int i: arr3) System.out.print(i + " ");
        System.out.println();

        int maxUnit = arr3[0], minUnit = arr3[0];
        for (int i: arr3) {
            if (i > maxUnit) maxUnit = i;
            if (i < minUnit) minUnit = i;
        }
        System.out.println("Max unit: " + maxUnit);
        System.out.println("Min unit: " + minUnit);

        System.out.print("So nguyen to: ");
        for (int i: arr3) {
            if (i == 1 || i == 0) continue;
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) isPrime = false;
            }
            if (isPrime) System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("So hoan hao: ");
        for (int i: arr3) {
            int sum = 1;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) sum += (j + i/j);
            }
            if (sum == i) System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("So chan: ");
        for (int i: arr3) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println();

        int[] arr4 = new int[n];
        for (int i = 0; i < arr4.length; i++) arr4[i] = rand.nextInt(100);
        System.out.print("Mang random: ");
        for (int i: arr4) System.out.print(i + " ");
        System.out.println();

        for (int i = 0; i < arr4.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr4.length; j++) {
                if (arr4[j] < arr4[minIndex]) minIndex = j;
            }
            int temp = arr4[i];
            arr4[i] = arr4[minIndex];
            arr4[minIndex] = temp;
        }

        System.out.print("Mang random selection sort: ");
        for (int i: arr4) System.out.print(i + " ");
        System.out.println();

        int[] arr5 = new int[n];
        for (int i = 0; i < arr5.length; i++) arr5[i] = rand.nextInt(100);
        System.out.print("Mang random: ");
        for (int i: arr5) System.out.print(i + " ");
        System.out.println();

        for (int i = 0; i < arr5.length - 1; i++) {
            for (int j = 0; j < arr5.length - i - 1; j++) {
                if (arr5[j] > arr5[j + 1]) {
                    int temp = arr5[j];
                    arr5[j] = arr5[j + 1];
                    arr5[j + 1] = temp;
                }
            }
        }
        System.out.print("Mang random bubble sort: ");
        for (int i: arr5) System.out.print(i + " ");
        System.out.println();
    }
}
