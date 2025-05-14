package za.co.admatech.factory;

import za.co.admatech.domain.Dispute;
import za.co.admatech.domain.enums.DisputeStatus;

import java.time.LocalDate;

public class DisputeFactory {

    // Factory method to create a Dispute with default values
    public static Dispute createDefaultDispute() {
        return new Dispute.Builder()
                .setDisputeId("DefaultID")
                .setDescription("Default Description")
                .setDisputeDate(LocalDate.now())
                .setDisputeStatus(DisputeStatus.IN_REVIEW)
                .build();
    }

    // Factory method to create a Dispute with specific values
    public static Dispute createDispute(String disputeId, String description, LocalDate disputeDate, DisputeStatus disputeStatus) {
        return new Dispute.Builder()
                .setDisputeId(disputeId)
                .setDescription(description)
                .setDisputeDate(disputeDate)
                .setDisputeStatus(disputeStatus)
                .build();
    }

    // Factory method to create a copy of an existing Dispute
    public static Dispute createCopyOfDispute(Dispute existingDispute) {
        return new Dispute.Builder()
                .copy(existingDispute)
                .build();
    }
}
