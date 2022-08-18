package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int max1 = first >= second ? first: second;
        int max2 = max1 >= third ? max1: third;
        System.out.println(max2);
    }
}
