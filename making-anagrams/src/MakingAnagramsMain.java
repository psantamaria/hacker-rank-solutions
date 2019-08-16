import java.util.stream.IntStream;

public class MakingAnagramsMain {

    public static void main(String[] args) {
        String input1 = "dcbac";
        String input2 = "dcbad";

        System.out.println(removeCharacterToMakeAnagrams(input1, input2));
    }

    private static int removeCharacterToMakeAnagrams(final String a, final String b) {
        int[] charactersInA = new int[26];
        int[] charactersInB = new int[26];

        IntStream.range(0, a.length()).forEach(i -> charactersInA[a.charAt(i) - 97]++);
        IntStream.range(0, b.length()).forEach(i -> charactersInB[b.charAt(i) - 97]++);

        return IntStream.range(0, 26).map(i -> Math.abs(charactersInA[i] - charactersInB[i])).sum();
    }
}
