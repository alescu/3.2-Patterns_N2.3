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
        // synchronized () {
            try {
                Thread.sleep(3000); // Dormir 1 segon (1000 milisegons)
            } catch (InterruptedException e) {
                // Gestionar la interrupció (opcional)
                System.out.println("Fil interromput: " + e.getMessage());
                // Si volem que el fil acabi al ser interromput, podem fer un return;
                // return;
            }
            if (callback != null) {
                // System.out.println("\n..."+ userPayment.getClass() + 2000 + " millis after.....");
                callback.taskCompleted(this.userPayment);
            }
        // }
    }
}
