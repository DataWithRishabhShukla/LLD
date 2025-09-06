package DesignPatterns.Factory.NotificationSystem;

public class Client {
    public static void main(String[] args) {
        Notification smsNotification = NotificationFactory.createNotification(NotificationType.SMS,"Charu","From sms notification!!","Rishabh");
        smsNotification.sendNotification();
        System.out.println(smsNotification.getMessage());
        System.out.println(smsNotification.notificationType());
        System.out.println(smsNotification.getRecipient());

    }
}
