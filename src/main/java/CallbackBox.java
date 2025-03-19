public class CallbackBox implements Callback{
    @Override
    public void taskCompleted() {
        System.out.println("    .........................");
        System.out.println("    Payment made successfully");
        System.out.println("    .........................");
    }
}
