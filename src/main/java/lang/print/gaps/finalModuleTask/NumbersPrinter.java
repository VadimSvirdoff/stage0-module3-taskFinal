package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        boolean isPositive = (number & Integer.MIN_VALUE) == 0;
        System.out.println(isPositive);
    }
}
