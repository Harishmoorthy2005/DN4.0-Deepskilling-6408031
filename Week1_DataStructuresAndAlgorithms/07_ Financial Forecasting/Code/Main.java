public class Main {

    // Recursive method to predict future value
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue; // base case
        }
        // Recursive call: apply growth rate for each year
        return predictFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialAmount = 1000;       // starting money
        double growthRate = 0.05;          // 5% annual growth
        int years = 5;

        double futureValue = predictFutureValue(initialAmount, growthRate, years);
        System.out.printf("Future value after %d years: %.2f%n", years, futureValue);
    }
}
