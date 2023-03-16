package Task01;

import java.util.Scanner;

public class MarioPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 2 * (n - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}