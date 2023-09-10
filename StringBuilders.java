public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Bujynanu");
        System.out.println(sb);

        //character at 0th index
        System.out.println(sb.charAt(0));

        //set char at 0th index
        sb.setCharAt(2, 's');
        System.out.println(sb);

        //insert char at nth index
        sb.insert(6,'n');
        System.out.println(sb);

        //delete
        sb.delete(4,9);
        System.out.println(sb);

        //append
        StringBuilder sa =new StringBuilder("S");
        sa.append("u");
        sa.append("p");
        sa.append("p");
        sa.append("u");
        System.out.println(sa);
        System.out.println(sa.length());


    }
}
