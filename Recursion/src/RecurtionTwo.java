import java.util.HashSet;

public class RecurtionTwo {
    public static void main(String[] args) {
//        int n=3;
//        TowerOfHonai(n,"S","H","D");
//        //123,132,213
//    }
//    static void TowerOfHonai(int n,String source,String Helper,String Destination){
//        if (n==1){
//            System.out.println("transfer disk " + n + " from " + source + " to " + Destination);
//            return;
//        }
//        //transfer top n-1 from src to helper using dest as 'helper'
//        TowerOfHonai(n-1, source, Destination, Helper);
//
//        //transfer nth from src to dest
//        System.out.println("transfer disk " + n + " from " + source + " to " + Destination);
//
//        //transfer n-1 from helper to dest using src as 'helper'
//        TowerOfHonai(n-1, Helper, source, Destination);
//    }

//        -----------------------------------------------------------------------------------------------
        //reverse string
//        String str="abcd";
//        printRev(str,str.length()-1);
//    }
//    static void printRev(String str,int index){
//        if (index==0){
//            System.out.println(str.charAt(index));
//            return;
//        }
//        System.out.print(str.charAt(index));
//        printRev(str,index-1);
//
//    }

//        ----------------------------------------------------------------------------------------------
        //check an array if It's sorted or not
//        int[] arr = {1, 2, 3, 4, 8, 5};
//        System.out.println(IsSorted(arr, 0));
//    }
//    private static boolean IsSorted(int[] arr, int index) {
//        if (index == arr.length - 1) {
//            return true;
//        }
//        if (arr[index] < arr[index + 1]) {
//            //array is sorted till now
//            return IsSorted(arr, index + 1); //use return for forwarded calls
//        } else {
//            return false;
//        }
//        ---------------------------------------------------------------------------------------
        //move all element(u) in last
//        String str="SuppuILoveyousomuch";
//        MoveAllX(str,0,0,"");
//
//    }
//
//    public static void MoveAllX(String str,int index,int count, String newstr) {
//            if (index==str.length()-1){
//                for (int i = 0; i < count; i++) newstr += 'u';
//                System.out.println(newstr);
//                return;
//            }
//
//            char CurrChar=str.charAt(index);
//            if (CurrChar=='u'){
//                count++;
//                MoveAllX(str,index+1,count,newstr);
//            }else{
//                //put current char in newstring
//                newstr += CurrChar;
//                MoveAllX(str,index+1,count,newstr);
//            }
//        -------------------------------------------------------------------------------------------------
        //remove duplicate from a string
//        String str = "abbbccdd";
//        removeDuplicates(str, 0, "");
//    }
//    static void removeDuplicates(String str, int idx, String newstring) {
//        if (idx == str.length()) {
//            System.out.println(newstring);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        if (map[currChar - 'a']) {
//            removeDuplicates(str, idx + 1, newstring);
//        } else {
//            newstring += currChar;
//            map[currChar - 'a'] = true;
//            removeDuplicates(str, idx + 1, newstring);
//        }
//    }
//    public static boolean[] map = new boolean[26];
//}
//      ----------------------------------------------------------------------------------------------
        //Print all unique subsequences of a string.
        String str1 = "abc";
        //String str2 = "aaa";
        HashSet<String> allSubseq = new HashSet<>();
        printSubseq(str1, 0, "", allSubseq);
    }

    public static void printSubseq(String str, int idx, String res, HashSet<String>allSubseq) {
        if (idx == str.length()) {
            if (allSubseq.contains(res)) {
                return;
            }
            allSubseq.add(res);
            System.out.println(res);
            return;
        }

        //choose
        printSubseq(str, idx + 1, res + str.charAt(idx), allSubseq);
        //don't choose
        printSubseq(str, idx + 1, res, allSubseq);

//   --------------------------------------------------------------------------------------------
        //Print keypad combination


    }
}