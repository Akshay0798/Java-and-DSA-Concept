import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        //Q:Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

//        Scanner sc= new Scanner(System.in);
//        int size=sc.nextInt();
//        String[] array =new String[size];
//
//        int Totalength=0;
//        for (int i = 0; i < size; i++) {
//            array[i]= sc.next();
//            Totalength += array[i].length();
//
//        }
//        System.out.println(Totalength);
//        ----------------------------------------------------------------------------------------------

        /* Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in
            the original string with letter ‘i’. */
        //Example :
        //original = “eabcdef’ ; result = “iabcdif”
        //Original = “xyz” ; result = “xyz”

//        Scanner sc = new Scanner (System.in);
//        String str = sc.next();
//        String result = "";
//
//        for(int i=0; i<str.length(); i++) {
//            if(str.charAt(i) == 'e') {
//                result += 'i';
//            } else {
//                result += str.charAt(i);
//            }
//        }
//
//        System.out.println(result);

//        -----------------------------------------------------------------------------------

        /* Input an email from the user. You have to create a username from the email by deleting the part that comes
            after ‘@’. Display that username to the user.
        Example :
        email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
        email = “helloWorld123@gmail.com”; username = “helloWorld123” */

        Scanner sc = new Scanner (System.in);
        String email = sc.next();
        String userName = "";

        for(int i=0; i<email.length(); i++) {
            if(email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
        }

        System.out.println(userName);

    }
}
