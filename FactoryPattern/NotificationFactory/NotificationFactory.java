class NotificationFactory {
    public static Notification sendNotification(String mode){
        if("sms".equalsIgnoreCase(mode)){
            return new SMSnotification();
        } else if ("email".equalsIgnoreCase(mode)){
            return new EmailNotification();
        } else if ("mobile".equalsIgnoreCase(mode)) {
            return new MobileNotification();
        }
        return new UnknowNotification();
    }
}
