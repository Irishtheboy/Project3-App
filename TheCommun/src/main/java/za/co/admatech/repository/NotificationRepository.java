package za.co.admatech.repository;

import za.co.admatech.domain.Notification;
import java.util.ArrayList;
import java.util.List;

//222134763;

public class NotificationRepository {
    private final List<Notification> notifications = new ArrayList<>();

    public void save(Notification notification) {
        notifications.add(notification);
    }

    public List<Notification> findAll() {
        return new ArrayList<>(notifications);
    }

    public Notification findByRecipient(String recipient) {
        return notifications.stream()
                .filter(notification -> notification.getRecipient().equals(recipient))
                .findFirst()
                .orElse(null);
    }

    public void markAsRead(Notification notification) {
        // Here we would typically update the notification in a database.
        // For this example, we can just create a new notification with the same message but marked as read.
        Notification updatedNotification = new Notification.Builder()
                .copy(notification)
                .setIsRead(true)
                .build();
        notifications.remove(notification);
        notifications.add(updatedNotification);
    }

    public void delete(Notification notification) {
        notifications.remove(notification);
    }
}