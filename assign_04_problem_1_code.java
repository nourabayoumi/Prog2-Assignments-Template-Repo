//noura mostafa
//20216331

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                arr[i] = 1;
            } else if (arr[i] < 0) {
                arr[i] = 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
