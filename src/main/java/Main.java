public class Main {

    /*
     Callback
     Simula una passarel·la de pagament que rebi un objecte encapsulador del mètode de
     pagament a efectuar: targeta de crèdit, Paypal o deute en compte bancari.

     La passarel·la invocarà el pagament sense conèixer la forma i retornant el control
     a la classe d'origen.
     La classe que invoca la passarel·la de pagament serà una botiga de sabates.

     */
    public static void main(String[] args){

        Payment payment_1 = new Payment("The Most Biggest Shoes Shop", 22.9, Payment.PaymentMethod.ACCOUNT_DEBIT);

        System.out.println("\nSend payment number 1");
        System.out.println("                    ... awaiting response");
        PaymentGateway paymentGateway = new PaymentGateway(payment_1);
        paymentGateway.run();

        System.out.println("\nSend payment number 2");
        System.out.println("                    ... awaiting response");
        Payment payment_2 = new Payment("The Most Biggest Shoes Shop 2", 15.25, Payment.PaymentMethod.ACCOUNT_DEBIT);
        paymentGateway = new PaymentGateway(payment_2);
        paymentGateway.run();

    }

}
