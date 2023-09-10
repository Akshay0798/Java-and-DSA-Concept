import java.util.Scanner;

public class Find_Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // Find and print the unique number
        int uniqueNumber = findUniqueNumber(arr);
        System.out.println(uniqueNumber);
    }
    static int findUniqueNumber(int[] arr) {
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique ^= arr[i];
        }
        return unique;
    }
}
