public class FinancialAnalyzer {
    double calculateInterest(double principal, double rate, int years) {
        return (principal * rate * years) / 100;
    }
    double applyBonus(double interest, boolean isLoyal) {
        if (isLoyal) {
            return interest + 50.0;
        }
        return interest;
    }
    void displayMetrics(double finalAmount) {
        System.out.println("Final Amount: " + finalAmount);
    }

    public static void main(String[] args) {

        FinancialAnalyzer fa = new FinancialAnalyzer();

        double principal = 10000.0;
        double rate = 5.0;
        int years = 2;
        boolean isLoyal = true;

        double interest = fa.calculateInterest(principal, rate, years);
        double finalAmount = fa.applyBonus(interest, isLoyal);

        fa.displayMetrics(finalAmount);
    }
}