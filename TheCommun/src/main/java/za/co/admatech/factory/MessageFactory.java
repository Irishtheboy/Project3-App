package za.co.admatech.factory;

import za.co.admatech.domain.Message;
import za.co.admatech.util.Helper;

import java.util.Date;

public class MessageFactory {

    public static Message createMessage(
            String messageId,
            String content,
            Date timestamp,
            boolean isRead
    ) {
        if (Helper.isNullOrEmpty(messageId) || Helper.isNullOrEmpty(content) || timestamp == null) {
            return null;
        }

        return new Message.Builder()
                .setMessageId(messageId)
                .setContent(content)
                .setTimestamp(timestamp)
                .setIsRead(isRead)
                .build();
    }
}
