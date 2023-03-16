package Task01;

import java.util.Scanner;

public class TwoStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        int l = s1.length();
        System.out.println(s1.substring(0, l / 2) + s2 + s1.substring(l / 2, (l)));
    }
}
