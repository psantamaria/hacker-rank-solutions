import java.util.Arrays;

public class MainPlusOneArray {

    /*
     * Given
     * [9,8,1] -> [9,8,2]
     * [1,2,9] -> [1,3,0]
     * [9,9,9] -> [1,0,0,0]
     * [9,9,9,5,8,7,3,9,9] -> [9,9,9,5,8,7,4,0,0]
     */

    public static void main(String[] args) {
        int[] sampleArray = new int[] {9, 9, 9, 5, 8, 7, 3, 9, 9};
        boolean carryOne = false;

        for (int i = sampleArray.length - 1; i >= 0; i--) {

            if (sampleArray[i] < 9) {
                sampleArray[i]++;
                break;
            } else {
                carryOne = i == 0;
                sampleArray[i] = 0;
            }
        }

        if (carryOne) {
            sampleArray = Arrays.copyOf(sampleArray, sampleArray.length + 1);
            sampleArray[0] = 1;
        }

        System.out.println(Arrays.toString(sampleArray));

    }
}
