public class Payment {
    private String shopName;
    private PaymentMethod paymentType;
    private Double amount;

    public static enum PaymentMethod {
        CREDIT_CARD, PAYPAL, ACCOUNT_DEBIT;
    }

    public Payment(String shopName, Double amount, PaymentMethod paymentType) {
        this.shopName = shopName;
        this.amount = amount;
        this.paymentType = paymentType;
    }

    public String getShopName() {
        return shopName;
    }

    public Double getAmount() {
        return amount;
    }
}
