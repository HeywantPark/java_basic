package static2.ex;

import java.util.Arrays;

public class MathArrayUtil {

    private MathArrayUtil() {
        //인스턴스 생성을 막는다.
    }

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double avg(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        Arrays.sort(values);
        return values[0];
    }
    public static int max(int[] values) {
//        int maxValue = values[0];
//        for (int value : values) {
//            if (value > maxValue) {
//                maxValue = value;
//            }
//        }
//        return maxValue;
        Arrays.sort(values);
        return values[values.length - 1];
    }
}
