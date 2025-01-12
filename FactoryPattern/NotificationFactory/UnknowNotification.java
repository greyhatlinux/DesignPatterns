public class UnknowNotification implements Notification{
    @Override
    public void notify(String message){
        System.out.println("Unknown Device : " + message);
    }
}
