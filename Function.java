import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String name=sc.next();
//        PrintMyName(name); //main function ..we call the function
//    }
//    static void PrintMyName(String name){
//        System.out.println(name);
//        return;  //whenever we give return it come to main function

//          //Avg of 3 no. ----------------------------------------------------------
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println(Average(a,b,c));
//    }
//
//    static int Average(int a, int b, int c){
//       int Avg=(a+b+c)/2;
//       return Avg;

        //calculate 1st n natural no.  -----------------------------------------
//        int n = sc.nextInt();
//        System.out.println(NaturalNo(n));
//    }
//    static int NaturalNo(int n){
//        int sum=0;
//        for (int i = 1; i <=n ; i++) {
//            sum=sum+i;
//
//        }
//        return sum;

        //find the greater no. -----------------------------------------------

//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        System.out.println(FindGreater(a,b));
//    }
//        static int FindGreater(int a,int b) {
//            if(a>b){
//                return a;
//            }else {
//                return b;
//            }
//        }

        //Circumference of circle

//        Double radius= sc.nextDouble();
//        System.out.println(Circumference(radius));
//
//    }
//    static Double Circumference(Double radius){
//
//        return 2*3.14*radius;

        //find age
//
//        int age = sc.nextInt();
//        System.out.println(Vote(age));
//    }
//    static Boolean Vote(int age){
//        if (age>18){
//            return true;
//        }
//        return false;

        /* Write a program to enter the numbers till the user wants and at the end
        it should display the count of positive, negative and zeros entered.*/

//        int positive = 0, negative = 0, zeros = 0;
//        System.out.println("Press 1 to continue & 0 to stop");
//        int input = sc.nextInt();
//
//        while(input == 1) {
//            System.out.println("Enter your number : ");
//            int number = sc.nextInt();
//            if(number > 0) {
//                positive++;
//            } else if(number < 0) {
//                negative++;
//            } else {
//                zeros++;
//            }
//
//            System.out.println("Press 1 to continue & 0 to stop");
//            input = sc.nextInt();
//        }
//
//        System.out.println("Positives : "+ positive);
//        System.out.println("Negatives : "+ negative);
//        System.out.println("Zeros : "+ zeros);

        /* Two numbers are entered by the user, x and n. Write a function to find the value of one number
            raised to the power of another i.e. x^n. */
        int x=sc.nextInt();
        int n=sc.nextInt();

        int result=1;
        for (int i = 0; i <=n ; i++) {
            result=result*x;
        }
        System.out.println(result);
    }
}