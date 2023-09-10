package Questions;

import java.io.*; // for handling input/output
import java.util.*; // contains a Collections framework
public class Distinct_Alphabet {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            int[] counts = new int[26];

            // Iterate through each character in the string
            for (char ch : str.toCharArray()) {
                // Increment the count for the corresponding alphabet
                if (ch >= 'a' && ch <= 'z') {
                    counts[ch - 'a']++;
                }
            }

            // Print the counts for each alphabet
            for (int count : counts) {
                System.out.print(count + " ");
            }
        }
    }

