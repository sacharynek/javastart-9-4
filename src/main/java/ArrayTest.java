public class ArrayTest {

    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];

        int[][] c = new int[10][10];
        int[][] d = new int[10][10];

        boolean output = ArrayComparator.compare(c,d);
        System.out.println(output);
        System.out.println(c[1]);
    }
}
