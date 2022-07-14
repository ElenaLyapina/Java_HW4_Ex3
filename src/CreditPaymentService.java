public class CreditPaymentService {
    public double calculate(int creditAmount, int periodInYears, double loanRate) {
        int periodInMonths = periodInYears * 12;
        double monthlyRate = loanRate / (100*12);

        double monthlyPayment = creditAmount * (monthlyRate / (1 - Math.pow(1 + monthlyRate, -1 * periodInMonths)));

        return monthlyPayment;

    }
}
