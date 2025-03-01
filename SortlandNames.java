/*
On the magical island of Sortland, there's a unique tradition: all citizens must organize their name lists for the annual celebration. However, their sorting rules are quite peculiar: they sort names primarily by the number of vowels in each name (in descending order). If two names have the same number of vowels, they are sorted alphabetically in ascending order.

Your task is to write a program that helps the citizens of Sortland organize their lists following these rules.

Example:

Input: ["Alice", "Bob", "Eve", "Oscar", "Uma"]

Output: ["Oscar", "Alice", "Uma", "Eve", "Bob"]

Explanation: Vowel counts: - Oscar (2 vowels), Alice (2 vowels), Uma (2 vowels), Eve (1 vowel), Bob (1 vowel)

Sorting first by vowel count (descending), then alphabetically for ties.


Input: ["Zara", "Anna", "lan", "Emma"]

Output: ["Anna", "Emma", "lan", "Zara"]
 */

import java.util.*;

public class SortlandNames {

    // Helper function to count the number of vowels in a name
    public static int countVowels(String name) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : name.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of names
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Initialize a list to store the names
        List<String> names = new ArrayList<>();

        // Take user input for each name
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names.add(scanner.nextLine());
        }

        // Sorting the list according to the given criteria
        Collections.sort(names, (a, b) -> {
            // Compare based on vowel count (descending order)
            int vowelsA = countVowels(a);
            int vowelsB = countVowels(b);
            
            // First, sort by vowel count (descending order)
            if (vowelsA != vowelsB) {
                return Integer.compare(vowelsB, vowelsA);
            }
            // If the vowel count is the same, sort alphabetically (ascending order)
            return a.compareTo(b);
        });

        // Output the sorted list
        System.out.println("Sorted names: " + names);

        scanner.close(); // Close the scanner to avoid resource leak
    }
}