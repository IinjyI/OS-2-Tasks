package Task01;

import java.util.ArrayList;
import java.util.Scanner;

public class CharLocator {
    public static void main(String[] args) {
        ArrayList<Integer> idx = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char c = scan.next().charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                idx.add(i);
        }
        System.out.println(idx);
    }
}
