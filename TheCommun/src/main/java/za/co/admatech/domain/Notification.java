package za.co.admatech.domain;

import java.time.LocalDateTime;

//222134763;

public class Notification {
    private final String message;
    private final String recipient;
    private final LocalDateTime timestamp;
    private final boolean isRead;

    private Notification(Builder builder) {
        this.message = builder.message;
        this.recipient = builder.recipient;
        this.timestamp = builder.timestamp;
        this.isRead = builder.isRead;
    }

    public String getMessage() {
        return message;
    }

    public String getRecipient() {
        return recipient;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public boolean isRead() {
        return isRead;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "message='" + message + '\'' +
                ", recipient='" + recipient + '\'' +
                ", timestamp=" + timestamp +
                ", isRead=" + isRead +
                '}';
    }

    public static class Builder {
        private String message;
        private String recipient;
        private LocalDateTime timestamp;
        private boolean isRead;

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }

        public Builder setTimestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder setIsRead(boolean isRead) {
            this.isRead = isRead;
            return this;
        }

        public Builder copy(Notification notification) {
            this.message = notification.message;
            this.recipient = notification.recipient;
            this.timestamp = notification.timestamp;
            this.isRead = notification.isRead;
            return this;
        }

        public Notification build() {
            return new Notification(this);
        }
    }
}