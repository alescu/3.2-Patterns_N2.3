public class PaymentGateway implements Runnable {

    // private static final Object lock = new Object();
    private Callback  callback;
    private Payment  userPayment;

    public PaymentGateway(Payment userPayment) {
        this.userPayment = userPayment;
        this.callback = new CallbackBox();
    }

    @Override
    public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Fil interromput: " + e.getMessage());
            }
            if (callback != null) {
                callback.taskCompleted(this.userPayment);
            }

    }
}
