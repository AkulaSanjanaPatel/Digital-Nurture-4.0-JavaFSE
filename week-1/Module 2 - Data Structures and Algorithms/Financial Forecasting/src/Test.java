public class Test {
    public static void main(String[] args) {
        double initial = 1000.0;
        double rate = 0.05; // 5% annual growth
        int years = 5;

        double result = FinancialForecast.forecastRecursive(initial, rate, years);
        System.out.printf("Forecast after %d years (recursive): %.2f\n", years, result);

        Double[] memo = new Double[years + 1];
        double memoResult = FinancialForecast.forecastMemo(initial, rate, years, memo);
        System.out.printf("Forecast after %d years (memoized): %.2f\n", years, memoResult);
    }
}
