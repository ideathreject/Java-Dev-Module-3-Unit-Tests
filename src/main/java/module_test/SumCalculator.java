package module_test;

public class SumCalculator {
    public int sum(int n) {
        if (n < 1 ) throw new IllegalArgumentException("The number should be > 1");
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        System.out.println(sumCalculator.sum(3));
    }
}

