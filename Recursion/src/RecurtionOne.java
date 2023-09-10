public class RecurtionOne {
    public static void main(String[] args) {
        //print number 5 to 1

//        int n=5;
//        printNumber(n);
//
//    }
//    static void printNumber(int n){
//        if(n==0){
//            return;
//        }
//        System.out.println(n);
//        printNumber(n-1);
//    }
//    --------------------------------------------------------
        //print number 1 to 5

//        int n=1;
//        printNumber(n);
//
//    }
//    static void printNumber(int n){
//        if(n==6){
//            return;
//        }
//        System.out.println(n);
//        printNumber(n+1);
//    }
//        ----------------------------------------------------------------
        //print sum of n natural number
//        printSum(1,5,0);
//    }
//    static void printSum(int i,int n,int sum){
//        //base condition
//        if (i==n){ //when i=n then we have to add n also in sum
//            sum += i;
//            System.out.println(sum);
//            return;
//        }
//        sum += i;
//        printSum(i+1,n,sum);  //recursive call
//        System.out.println(i);  //just for checking before deleting/returning "i" value
//    }

//        --------------------------------------------------------------------------------------
        //print factorial of n number

//        int n=5;
//        System.out.println(Calfactorial(n));
//    }
//
//    static int Calfactorial(int n) {
//        if (n==0 || n==1){
//            return 1;
//        }
//
//        int FactN_1= Calfactorial(n-1);
//        int fact=n * FactN_1;
//        return fact;
//    }
//      ------------------------------------------------------------------------------------
        //print fibonnaci series
//        int a = 0;
//        int b = 1;
//        System.out.println(a);
//        System.out.println(b);
//        int n=7;
//        CalFibo(a,b,n-2); //bcoz we already print 2 no.(a & b), that's why n-2
//
//    }
//        static void CalFibo(int a,int b,int n){
//            if (n==0){
//                return;
//            }
//            int c=a+b;
//            System.out.println(c);
//            CalFibo(b,c,n-1);
//        }
//      ----------------------------------------------------------------------------------
        //print x^n (stack n format)

//        int ans=CalPower(2,5);
//        System.out.println(ans);
//    }
//    static int CalPower(int x,int n){
//        if(x==0){ //base 1
//            return 0;
//        }
//        if(n==0){ //base 2
//            return 1;
//        }
//        int xPowN_1=CalPower(x,n-1);
//        int xPowN= x * xPowN_1;
//        return xPowN;
//    }

//  ------------------------------------------------------------------
        //print x^n( stack log n format)
//        int x = 9, n = 5;
//        int output = printPower(x, n);
//        System.out.println(output);
//    }
//    public static int printPower(int x, int n) {
//        if (n == 0) {
//            return 1;
//        }
//        if (n % 2 == 0) {
//            return printPower(x, n / 2) * printPower(x, n / 2);
//        } else {
//            return x * printPower(x, n / 2) * printPower(x, n / 2);
//        }
    }
}
