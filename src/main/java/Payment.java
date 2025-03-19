public class Payment {

    private PaymentMethod paymentType;
    private Double amount;

    public static enum PaymentMethod {
        CREDIT_CARD, PAYPAL, ACCOUNT_DEBIT;
    }

    public Payment(PaymentMethod paymentType) {
        this.paymentType = paymentType;
    }

    public void pay(){

    }

}
