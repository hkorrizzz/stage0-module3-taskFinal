package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int thousands = number / 1000;
        int hundreds = (number / 100) % 10;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        int sum = thousands + hundreds + tens + ones;
        System.out.println(sum);
    }
}
