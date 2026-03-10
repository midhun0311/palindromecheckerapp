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

        // Normalize the string (remove spaces & symbols, convert to lowercase)
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // Compare characters from start and end
        for (int i = 0, j = normalized.length() - 1; i < j; i++, j--) {

            if (normalized.charAt(i) != normalized.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? " + isPalindrome);

        sc.close();
    }
}
