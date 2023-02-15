package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int previous = 0, current = 1;
        for (int i = 0; i < lastFibonacci; i++) {
            if (i < 2) {
                System.out.println(i);
                continue;
            }
            int temp = current;
            current += previous;
            previous = temp;
            System.out.println(current);
        }
    }

}
