public class Missing {
    public static void main(String[] args) {
        int[] arr = {1,5,1,3};
        System.out.println(findMissingElement(arr));
    }

    static int findMissingElement(int[] arr) {
        int xor = 0;
        for (int i=0;i< arr.length-1;i++) {
            xor = xor ^ i;
        }
        return xor;
    }
}
