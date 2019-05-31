import java.util.Random;

public class ArrayTest {

    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        Random rand = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(25);
            b[i] = a[i];
            c[i] = rand.nextInt(50);
        }
        int[][] d = new int[10][10];
        int[][] e = new int[10][10];

        boolean output = ArrayComparator.compare(a, b);
        System.out.println(output);
        output = ArrayComparator.compare(a, c);
        System.out.println(output);


        output = ArrayComparator.compare(d, e);
        System.out.println(output);

        output = ArrayComparator.compare(e, e);
        System.out.println(output);

    }
}
