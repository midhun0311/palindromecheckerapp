import java.util.Scanner;
import java.util.Stack;
import java.util.*;
import java.util.LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Is Palindrome?: " + result);
    }

    private static boolean check(String s, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters are not equal
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call
        return check(s, start + 1, end - 1);
    }
}


