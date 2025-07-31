package za.co.admatech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.admatech.domain.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    Message findByMessageId(String messageId);
    void deleteByMessageId(String messageId);
    void deleteAllByUserId(String userId);
}
    // Additional methods can be added as needed
