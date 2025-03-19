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

        Payment payment_1 = new Payment(Payment.PaymentMethod.ACCOUNT_DEBIT);

        PaymentGateway paymentGateway = new PaymentGateway(payment_1);

        paymentGateway.startProcess();

    }

}
