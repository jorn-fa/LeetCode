package hiel.jorn.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCasePermutation {

    private static boolean check(String word) {

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
            if (!Character.isLetterOrDigit(word.charAt(i))) {
                System.out.println("no match");

                return false;}
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        char letters[] = word.toCharArray();

        List<String> result = new ArrayList<>();


        if (word.length()>=1 && word.length()<=12 && check(word) ) {
            System.out.println("matches");


            result.add(letters.toString());

        }

        result.forEach(a-> System.out.println(a));

    }


}
