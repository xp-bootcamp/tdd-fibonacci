package cc.xpbootcamp.tdd;

public class FiberCalculator {
    public static long calculate(int index) {
        if (index <= 0 || index > 50) {
            throw new IllegalArgumentException();
        }
        if (index == 1 || index == 2) {
            return 1;
        }

        long first = 1, second = 1;
        long temp;
        for (int i = 3; i <= index; i++) {
            temp = first;
            first = second;
            second = temp + second;
        }
        return second;
    }
}
