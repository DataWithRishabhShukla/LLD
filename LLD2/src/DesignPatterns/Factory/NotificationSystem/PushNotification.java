package DesignPatterns.Factory.NotificationSystem;

public class PushNotification extends  Notification{
    public PushNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Push notification sent to device " + getRecipient());
        System.out.println("Message: " + getMessage());

    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}
