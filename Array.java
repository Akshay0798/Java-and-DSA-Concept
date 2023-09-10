import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        int[] marks=new int[3];
//        marks[0]=45;
//        marks[1]=85;
//        marks[2]=98;
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(marks[i]);
//        }

//        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
//        int[]number=new int[size];
//
//        //input
//        for (int i = 0; i < size; i++) {
//            number[i]=sc.nextInt();
//        }
//        //output
//        for (int i = 0; i < size; i++) {
//            System.out.print(number[i] +" ");
//        }
//
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]number=new int[size];

        for (int i = 0; i < size; i++) {
            number[i]=sc.nextInt(); //we put value in array
        }
        //we have to find out value,on which index have
        int x= sc.nextInt();
        for (int i = 0; i <number.length ; i++) {
            if (number[i]==x){
                System.out.println("The value of " + x + " we find in index no" + i);
            }
        }
        
    }
}
