public class CallbackBox implements Callback{
    @Override
    public void taskCompleted(Payment  userPayment) {
        System.out.println("    ........................." +
        "\n    Payment made successfully" +
        "\n    "+userPayment.getShopName() + " : " + userPayment.getAmount() + "€" +
        "\n    .........................");
    }

}
