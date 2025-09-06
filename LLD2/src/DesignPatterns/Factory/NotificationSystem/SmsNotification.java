package DesignPatterns.Factory.NotificationSystem;

public class SmsNotification extends  Notification{
    public SmsNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS sent to " + getRecipient());
        System.out.println("Message: " + getMessage());

    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.SMS;
    }
}
