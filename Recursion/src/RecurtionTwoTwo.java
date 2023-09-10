public class RecurtionTwoTwo {
    //find first and last occarance of element

//    static int first = -1;
//    static int last = -1;
//
//    public static void FindOccarance(String str, int index, char element) {
//        if (index == str.length()) {
//            System.out.println(first);
//            System.out.println(last);
//            return;
//        }
//        char currentChar = str.charAt(index);
//        if (currentChar == element) {
//            if (first == -1) {
//                first = index;
//            } else {
//                last = index;
//            }
//        }
//        FindOccarance(str, index + 1, element);
//    }
//
//    public static void main(String[] args) {
//        String str="asgydbuhdibdjhgsl";
//        FindOccarance(str,0,'s');
//    }
//}

//------------------------------------------------------------------------------------------------------

    //Print keypad combination
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs","tu", "vwx", "yz"};

    public static void printKeypadCombination(String number, int idx, String res) {
        if (idx == number.length()) {
            System.out.print(res + " ");
            return;
        }

        for (int i = 0; i < keypad[number.charAt(idx) - '0'].length(); i++) {
            char curr = keypad[number.charAt(idx) - '0'].charAt(i);
            printKeypadCombination(number, idx + 1, res + curr);
        }
    }

    public static void main(String[] args) {
        String number = "19";
        printKeypadCombination(number, 0, "");

    }
}





