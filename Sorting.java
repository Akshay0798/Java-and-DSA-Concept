import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 8, 6, 4, 2, 10};

        //bubble sort
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length-i-1; j++) { //-i : bcoz sorted element we have to remove(which is already sorted)
//                if (arr[j] > arr[j+1]){
//                    //swap
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        printArray(arr);
//    }
//    static void printArray( int arr[]){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();

//        ________________________________________________________________

        //selection sort
//        for (int i = 0; i < arr.length - 1; i++) {
//            int smallest = i;
//            for (int j = i + 1; j < arr.length; j++) { //first smallest we consider 0th element which is i..then we have to compare from next element which is i+1;
//                if (arr[smallest] > arr[j]) {
//                    smallest = j;
//                }
//                int temp = arr[smallest];
//                arr[smallest] = arr[i];
//                arr[i] = temp;
//            }
//        }
//        printArray(arr);
//    }
//    static void printArray ( int arr[]){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        }
//        ------------------------------------------------------------------------

        //insertion sort
//        for (int i = 0; i < arr.length-1; i++) {
//            int currentEle = arr[i];
//            int j=i-1;
//            while(j >= 0 && arr[j] > currentEle){
//                //keep swapping
//                arr[j+1] = arr[j];
//                j--;
//            }
//            arr[j+1] = currentEle;
//        }
//        printArray(arr);
//    }
//    static void printArray ( int arr[]){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        }

//    -----------------------------------------------------------------------------------------

        //insertion Sort method 2

        insertion(arr);
        System.out.println((arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i = 1; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else {
                    break;
                }
            }
        }
    }
}
