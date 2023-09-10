import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();

        int[][] array =new int[row][col];

//        //input
//
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                array[i][j]=sc.nextInt();
//            }
//        }
//        //output
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }

        /* Q.  find the number */

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col ; j++) {
                array[i][j]=sc.nextInt();
            }
        }
        int x= sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (x==array[i][j]){
                    System.out.println("Found at index no " + i + "," + j);
                }
            }
        }
    }
}
