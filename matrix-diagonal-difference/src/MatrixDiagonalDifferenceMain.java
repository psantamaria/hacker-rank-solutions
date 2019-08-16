import java.util.ArrayList;
import java.util.List;

public class MatrixDiagonalDifferenceMain {

    public static void main(String[] args) {
        final int[][] matrix = new int[][] {
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12}
        };

        final List<List<Integer>> list = new ArrayList<List<Integer>>() {{
            add(new ArrayList<Integer>() {{
                add(11);
                add(2);
                add(4);
            }});

            add(new ArrayList<Integer>() {{
                add(4);
                add(5);
                add(6);
            }});

            add(new ArrayList<Integer>() {{
                add(10);
                add(8);
                add(-12);
            }});
        }};

        //This should be 15
        System.out.println(getDiagonalDifference(matrix));
        System.out.println(getDiagonalDifference(list));
    }

    private static int getDiagonalDifference(List<List<Integer>> arr) {
        int leftToRight = 0;
        int rightToLeft = 0;
        boolean needToSum = true;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 1; j < arr.get(i).size(); j++) {
                if (needToSum) {
                    leftToRight += arr.get(i).get(i);
                    rightToLeft += arr.get(i).get(arr.get(i).size() - (i + 1));
                    needToSum = false;
                }
            }
            needToSum = true;
        }
        return Math.abs(leftToRight - rightToLeft);
    }


    private static int getDiagonalDifference(final int[][] matrix) {
        int leftToRight = 0;
        int rightToLeft = 0;
        boolean needToSum = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (needToSum) {
                    leftToRight += matrix[i][i];
                    rightToLeft += matrix[i][matrix[i].length - (i + 1)];
                    needToSum = false;
                }
            }
            needToSum = true;
        }

        return Math.abs(leftToRight - rightToLeft);
    }
}
