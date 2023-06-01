package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;

        // Extract each digit and add it to the sum
        sum += number % 10;        // Extract the last digit
        sum += (number / 10) % 10; // Extract the third digit
        sum += (number / 100) % 10;// Extract the second digit
        sum += number / 1000;      // Extract the first digit

        System.out.println(sum);
    }
}
