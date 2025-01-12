public class Main {
    public static void main(String[] args){
        Notification email = NotificationFactory.sendNotification("email");
        email.notify("User Created. Check sms for userid.");

        Notification sms = NotificationFactory.sendNotification("sms");
        sms.notify("User created. Userid = 1122");

        Notification random = NotificationFactory.sendNotification("randomDevice");
        random.notify("Random notification!");

        Notification mobile = NotificationFactory.sendNotification("mobile");
        mobile.notify("User created! Details sent to sms.");

    }
}
