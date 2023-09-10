import java.util.HashSet;
import java.util.Scanner;

public class Hashing_Pair {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of testcases

        for(int i=1;i<=t;i++) {
            int arrSize = scanner.nextInt(); // Size of the array
            int sum = scanner.nextInt(); // Target sum
            int[] arr = new int[arrSize]; // Array elements

            for (int j = 0; j < arrSize; j++) {
                arr[j] = scanner.nextInt();
            }

            int result = findPair(arr, sum, arrSize);
            System.out.println(result);
        }


    }

    public static int findPair(int[] arr, int sum, int arrSize) {
        HashSet<Integer> set=new HashSet<>();

        for (int j = 0; j < arrSize; j++) {
            int compliment=sum-arr[j];
            if(set.contains(compliment))
                return 1;
            set.add(arr[j]);

        }
        return 0;
    }
}
