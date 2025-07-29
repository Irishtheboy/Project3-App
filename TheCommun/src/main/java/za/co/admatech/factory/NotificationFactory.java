package za.co.admatech.domain.factory;

import za.co.admatech.domain.Notification;
import za.co.admatech.domain.enums.NotificationType;
import java.time.LocalDateTime;

public class NotificationFactory {

    public static Notification createNotification() {
        return new Notification.Builder()
                .setMessage("Default Message")
                .setRecipient("Default Recepient")
                .setTimestamp(LocalDateTime.now())
                .setIsRead(false)
                .build();
    }

    public static Notification createReadNotification(String message, String recipient, NotificationType notificationType) {
        return new Notification.Builder()
                .setMessage(message)
                .setRecipient(recipient)
                .setTimestamp(LocalDateTime.now())
                .setIsRead(true)
                .build();
    }
}