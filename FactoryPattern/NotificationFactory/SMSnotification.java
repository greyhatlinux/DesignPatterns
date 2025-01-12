public class SMSnotification implements Notification{
    @Override
    public void notify(String message){
        System.out.println("SMS Notification : " + message);
    }
}
