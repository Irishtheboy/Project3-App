package za.co.admatech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.admatech.domain.Dispute;
import za.co.admatech.domain.enums.DisputeStatus;

import java.time.LocalDate;

@Repository
public interface DisputeRepository extends JpaRepository<Dispute, Long> {
    Dispute findByDisputeId(String disputeId);

    Dispute findByDescription(String description);

    Dispute findByDisputeDate(LocalDate disputeDate);

    Dispute findByDisputeStatus(DisputeStatus disputeStatus);

    void deleteByDisputeId(String disputeId);
}
