public class Main {
    public static void main(String[] args){
        CreditPaymentService monthlyService = new CreditPaymentService();

        int creditAmount = 1_000_000;
        int periodInYears = 3;
        double loanRate = 9.99;

        double result = monthlyService.calculate(creditAmount,periodInYears,loanRate);
        long resultInt = Math.round(result);
        System.out.println(resultInt);
    }
}
