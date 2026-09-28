public class Task01{
    public static void main(String[] args) {
        System.out.print("what is the price of purchase") ;
        double purchasePrice = 100.00;
        double taxRate= 0.05;
        double salesTax= 0.00;
        salesTax = purchasePrice * taxRate;
        System.out.println("The purchase price is $" + purchasePrice);
        System.out.println("The tax rate is $" + salesTax);

    }
}
