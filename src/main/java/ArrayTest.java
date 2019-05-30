public class ArrayTest {

    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];

        boolean output = ArrayComparator.compare(a,b);
        System.out.println(output);
        System.out.println(a[1]);
    }
}
