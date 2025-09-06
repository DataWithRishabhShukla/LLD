package DesignPatterns.Factory.NotificationSystem;

public class NotificationFactory {
    public static Notification createNotification(NotificationType notificationType,String recipient,String message,String sender){
        return switch (notificationType){
            case EMAIL -> new EmailNotification(recipient,message,sender);
            case PUSH -> new PushNotification(recipient,message);
            case SMS -> new SmsNotification(recipient,message);
            default -> throw new IllegalArgumentException("Invalid Notification type");
        };

    }
}
