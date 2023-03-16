package Task01;

import java.util.Scanner;

public class VowelsRemoval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String str = s.replaceAll("[aeiouAEIOU]", "");
        System.out.println(str);
    }
}

