//noura mostafa
//20216331

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = 0, num2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");
 

            int number_n= num1 + num2;
            num1 = num2;
            num2 = number_n;
        }
    }
}
