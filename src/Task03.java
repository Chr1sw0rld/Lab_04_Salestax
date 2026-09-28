public class Task03 {
    public static void main(String[] args) {
        double balance = 5000.00;
        double interestRate = 0.17;
        double monthOneInterestRate = 0.0;
        double monthTwoInterestRate = 0.0;
        monthOneInterestRate = balance * interestRate;
        balance = balance + monthOneInterestRate;
        monthTwoInterestRate = balance * interestRate;
        balance = balance + monthTwoInterestRate;
        System.out.println("Interest due after one month: $" + monthOneInterestRate);
        System.out.println("Interest due after two months: $" + monthTwoInterestRate);


    }
}
