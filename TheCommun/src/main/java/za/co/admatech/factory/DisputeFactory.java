package za.co.admatech.factory;

import za.co.admatech.domain.Dispute;
import za.co.admatech.domain.enums.DisputeStatus;
import za.co.admatech.util.Helper;

import java.time.LocalDate;

public class DisputeFactory {

    public static Dispute createDispute(String disputeId, String description, LocalDate disputeDate, DisputeStatus disputeStatus) {
        if (Helper.isNullOrEmpty(disputeId) || Helper.isNullOrEmpty(description) || disputeDate == null || disputeStatus == null)
            return null;

        return new Dispute.Builder()
                .setDisputeId(disputeId)
                .setDescription(description)
                .setDisputeDate(disputeDate)
                .setDisputeStatus(disputeStatus)
                .build();
    }

    public static Dispute createDefaultDispute() {
        return new Dispute.Builder()
                .setDisputeId("DefaultID")
                .setDescription("Default Description")
                .setDisputeDate(LocalDate.now())
                .setDisputeStatus(DisputeStatus.IN_REVIEW)
                .build();
    }

    public static Dispute createCopyOfDispute(Dispute existingDispute) {
        if (existingDispute == null)
            return null;

        return new Dispute.Builder()
                .copy(existingDispute)
                .build();
    }
}
