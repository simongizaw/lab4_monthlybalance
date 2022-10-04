public class Main {
    public static void main(String[] args) {


        double credit = 5000;
        double payment = (credit *0.17) + credit;
        double noPay = payment + payment;

        System.out.println("Your payment after 1 month is " + payment );
        System.out.println("Your payment after 2 months is "+ noPay);
    }
}