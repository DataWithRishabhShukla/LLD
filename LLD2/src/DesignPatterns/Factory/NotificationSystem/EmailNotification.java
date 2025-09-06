package DesignPatterns.Factory.NotificationSystem;

public class EmailNotification extends Notification{
    private String sender;

    public EmailNotification(String recipient, String message,String sender) {
        super(recipient, message);
        this.sender = sender;
    }

    @Override
    public void sendNotification() {
        System.out.println("Email sent to " + getRecipient() + " from " + sender);
        System.out.println("Message: " + getMessage());

    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}
