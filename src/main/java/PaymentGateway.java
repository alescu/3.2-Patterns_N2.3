public class PaymentGateway {

    private Callback  callback;
    private Payment  userPayment;

    public PaymentGateway(Payment userPayment) {
        this.userPayment = userPayment;
        this.callback = new CallbackBox();
    }

    public void startProcess(){
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                if (callback != null) {
                    System.out.println("\n..." + 2000 + " millis after.....");
                    callback.taskCompleted();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
