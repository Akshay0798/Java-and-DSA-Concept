import java.util.Arrays;

public class MergeTwoArray {
    // Java program to merge two sorted arrays into another sorted array
    public static void main(String[] args)
    {
        int[] arrayA = new int[] {-7, 12, 17, 29, 41, 56, 79};
        int[] arrayB = new int[] {-9, -3, 0, 5, 19};

        int[] mergedArray = mergeArray(arrayA, arrayB);

        System.out.println("Array A : "+ Arrays.toString(arrayA));
        System.out.println("Array B : "+ Arrays.toString(arrayB));
        System.out.println("Merged Array : "+ Arrays.toString(mergedArray));
    }
    private static int[] mergeArray(int[] arrayA, int[] arrayB) {
            int[] mergedArray = new int[arrayA.length + arrayB.length];

            int i=0, j=0, k=0;

            while (i < arrayA.length && j < arrayB.length) {

                if (arrayA[i] < arrayB[j]) {

                    mergedArray[k] = arrayA[i];
                    i++;
                    k++;
                }
                else {

                    mergedArray[k] = arrayB[j];
                    j++;
                    k++;
                }
            }
            while (i < arrayA.length) {

                mergedArray[k] = arrayA[i];
                i++;
                k++;
            }

            while (j < arrayB.length) {

                mergedArray[k] = arrayB[j];
                j++;
                k++;
            }

            return mergedArray;
        }


    }


