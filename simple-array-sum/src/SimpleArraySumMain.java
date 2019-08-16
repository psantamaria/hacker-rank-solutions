import java.util.Arrays;

public class SimpleArraySumMain {

    public static void main(String args[]) {
        int[] ar = new int[] {1, 2, 3, 4, 10, 11};

        Arrays.stream(ar, 0 , ar.length).sum();

    }
}
