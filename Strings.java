//String are immutable
public class Strings {
    public static void main(String[] args) {
//        String name1="Akshay";
//        String name2="Suppu";
//        String name3=name1+" Love "+name2;
//        System.out.println(name3);
//        System.out.println(name3.length());
//
//        //charAt method
//        for (int i = 0; i < name3.length(); i++) {
//            System.out.print(name3.charAt(3));
//        }
//        ------------------------------------------------------
        //compare function
//        String name1="Akshay";
//        String name2="Akshay";
//
//        if(name1.equals(name2)) {
//            System.out.println("They are the same string");
//        } else {
//            System.out.println("They are different strings");
//        }
//
//        //DO NOT USE == to check for string equality
//        //Gives correct answer here
//        if(name1 == name2) {
//            System.out.println("They are the same string");
//        } else {
//            System.out.println("They are different strings");
//        }
//
//        //Gives incorrect answer here
//        if(new String("Suppu") == new String("Suppu")) {
//            System.out.println("They are the same string");
//        } else {
//            System.out.println("They are different strings");
//        }
//        ----------------------------------------------------------------
            //Substring method
//        String sentences="Akshay Love Suppu So much";
//        String name=sentences.substring(0,18);
//        System.out.println(name);
//        String name2=sentences.substring(7,sentences.length());
//        System.out.println(name2);

//        ------------------------------------------------------------------
            //parseInt() Method
            //used to parse the string value as a signed decimal value
            //converting a string value to an integer
//        String str = "123";
//        int number = Integer.parseInt(str);
//        System.out.println(number);

//        ------------------------------------------------------------------
            //ToString() Method
            //converting a integer value to string
        int interger = 123;
        String str = Integer.toString(interger);
        System.out.println(str);
        System.out.println(str.length());

    }
}
