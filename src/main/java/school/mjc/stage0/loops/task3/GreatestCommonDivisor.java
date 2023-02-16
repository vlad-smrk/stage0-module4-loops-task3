package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int min = Math.min(first, second);
        if (min == 0) {
            System.out.println(Math.max(first, second));
            return;
        }
        for (int i = min; i > 0; i--) {
            if (first % i == 0 && second % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }

}
