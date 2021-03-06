public class Test1 {
    public static void main(String[] args) {
        int val = 312321321;
        int [] result = factorsOf(val);
        System.out.println("\nThe factors of " + val + " are:");
        for(int i = 0; i < result.length && result[i] != 0; i ++){
            System.out.println(result[i] + " ");
        }
    }

    static int[] factorsOf(int val) {
        int limit = (int) Math.ceil(Math.sqrt(val));
        int [] numArray = new int[limit];
        int index = 0;
        for (int i = 1; i <= limit; i++) {
            if (val % i == 0) {
                numArray[index++] = i;
                val /= i;
            }
        }
        numArray[index] = val;
        return numArray;
    }
    
}