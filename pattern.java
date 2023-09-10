public class pattern {
    public static void main(String[] args) {
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int size=5;
//        for (int i = 1; i <=size; i++) {
//            for (int j = 1; j <=size; j++) {
//                if (i==1 || j==1 || i==size ||j==size){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        int n=4;
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//
//        int n=4;
//        for (int i = n; i >=1 ; i--) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int n=5;
//        //outer loop
//        for (int i = 1; i<=n ; i++) {
//            //inner loop -> for spaces
//            for (int j = 1; j<=n-i ; j++) {
//                System.out.print(" ");
//            }
//            //inner loop-> for star
//            for (int k = 1; k <=i ; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        int n=5;
//        for (int i = 1; i<=n ; i++) {
//           for (int j = 1; j <=i; j++) {
//               System.out.print(j + " ");
//           }
//           System.out.println();
//       }

//        int n=5;
//        for (int i = n; i >=1 ; i--) {
//            for (int j = 1; j <=n-i+1 ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        int n=5;
//        //outer loop
//        for (int i = 1; i <=n ; i++) {
//        //inner loop
//            for (int j = 1; j <=n-i+1 ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        /* Floyd's Triangle */

//        int n=5;
//        int number =1;
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(number+" ");
//                number++;
//
//            }
//            System.out.println();
//
//        }

//        int n=5;
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                if ((i+j)%2==0){
//                    System.out.print("1 ");
//                }else{
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }

        /* Butterfly pattern */

//        int n = 4;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            //spaces
//            int spaces = 2 * (n - i);
//            for (int k = 0; k <= spaces; k++) {
//                System.out.print(" ");
//            }
//            // upper right side
//            for (int L = 1; L <= i; L++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//            //Lower Half
//            for (int i = n; i >=1 ; i--) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("*");
//                }
//                //spaces
//                int spacess = 2 * (n - i);
//                for (int k = 0; k <= spacess; k++) {
//                    System.out.print(" ");
//                }
//                // upper right side
//                for (int L = 1; L <= i; L++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }

//        int n=5;
//        for (int i = 1; i <=n ; i++) {
//            //spaces
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <=n ; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /* Number pyramid */

//        int n=5;
//        for (int i = 1; i<=n ; i++) {
//            //spaces
//            for (int j = 1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//            //numbers -> print row number, row no. of times
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i+ " ");
//            }
//            System.out.println();
//        }


        /* Palindrome pattern*/

//        int n=5;
//        for (int i = 1; i <=n ; i++) {
//            //spaces
//            for (int j = 1; j <=n-i; j++) {
//                System.out.print(" ");
//            }
//            //first half number
//            for (int j = i; j >=1 ; j--) {
//                System.out.print(j);
//            }
//            //2nd half
//            for (int k = 2; k <=i ; k++) {
//                System.out.print(k);
//            }
//            System.out.println();
//        }


        /* Diamond pattern */


        int n=4;
        //upper half
        for (int i = 1; i <=n ; i++) {
            //spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower Half
        for (int i = n-1; i >=1 ; i--) {
            //spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
