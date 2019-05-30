public class ArrayComparator {

    public static boolean compare(int[] tabA, int[] tabB) {
        boolean output = true;
        if (null == tabA || null == tabB) {
            throw new IllegalArgumentException("Arguments may not be null");
        }
        if (tabA.length == 0 || tabB.length == 0) {
            throw new IllegalArgumentException("Arguments may not be empty");
        }

        if (tabA.length != tabB.length) {
            throw new IllegalArgumentException("Arrays have different length");
        }

        for (int i = 0; i < tabA.length; i++) {
            if (tabA[i] != tabB[i]) {
                output = false;
            }
        }
        return output;

    }

    public static boolean compare(int[][] tabA, int[] tabB[]){
        boolean output = true;
        if (null == tabA || null == tabB) {
            throw new IllegalArgumentException("Arguments may not be null");
        }
        if (tabA.length == 0 || tabB.length == 0) {
            throw new IllegalArgumentException("Arguments may not be empty");
        }

        if (tabA.length != tabB.length) {
            throw new IllegalArgumentException("Arrays have different length");
        }

        for (int i = 0; i < tabA.length; i++) {
            if (!compare(tabA[i], tabB[i])) {
                output = false;
            }
        }

        return output;
    }
}
