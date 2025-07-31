package za.co.admatech.domain;

import java.util.Date;

public class Message {
    private String messageId;
    private String content;
    private Date timestamp;
    private boolean isRead;

    private Message(){}

    public Message(Builder builder) {
        this.messageId = builder.messageId;
        this.content = builder.content;
        this.timestamp = builder.timestamp;
        this.isRead = builder.isRead;
    }

    public String getMessageId() {
        return messageId;
    }

    public String getContent() {
        return content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public boolean isRead() {
        return isRead;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId='" + messageId + '\'' +
                ", content='" + content + '\'' +
                ", timestamp=" + timestamp +
                ", isRead=" + isRead +
                '}';
    }

    public static class Builder {
        private String messageId;
        private String content;
        private Date timestamp;
        private boolean isRead;

        public Builder setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setTimestamp(Date timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder setIsRead(boolean isRead) {
            this.isRead = isRead;
            return this;
        }

        public Message build() {
            Message message = new Message();
            message.messageId = this.messageId;
            message.content = this.content;
            message.timestamp = this.timestamp;
            message.isRead = this.isRead;
            return message;
        }
    }
}