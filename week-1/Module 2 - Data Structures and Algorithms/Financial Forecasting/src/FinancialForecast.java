class FinancialForecast {
    static double forecastRecursive(double initial, double rate, int years) {
        if (years == 0) return initial;
        return forecastRecursive(initial, rate, years - 1) * (1 + rate);
    }

    static double forecastMemo(double initial, double rate, int years, Double[] memo) {
        if (years == 0) return initial;
        if (memo[years] != null) return memo[years];
        memo[years] = forecastMemo(initial, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }
}
