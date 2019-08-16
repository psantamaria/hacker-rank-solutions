public class Main {

    static Long sum = 0l;

    public static void main(String[] args) {

        int value = 123;
        int k = 0;
        long newValue = getNewValue(value, k);
        System.out.println(getSuperDigit(newValue));
    }

    private static long getNewValue(int n, int k) {
        if ((n > -10 && n < 10) && k == 0) {
            return n;
        }

        String valueToString = String.valueOf(n);
        StringBuilder builder = new StringBuilder(String.valueOf(n));

        for (int i = 1; i < k; i++) {
            builder.append(valueToString);
        }

        return Long.parseLong(builder.toString());
    }


    private static int getSuperDigit(long n) {
        while (n > 10) {
            sum += n % 10;
            n = n / 10;
            getSuperDigit(n);
        }

        return new Long(n + sum).intValue();
    }
}
