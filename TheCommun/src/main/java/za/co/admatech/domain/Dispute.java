package za.co.admatech.domain;

import za.co.admatech.domain.enums.DisputeStatus;

import java.time.LocalDate;

public class Dispute {
    private String disputeId;
    private String description;
    private LocalDate disputeDate;
    private DisputeStatus disputeStatus;

    public Dispute() {
    }

    private Dispute(Builder builder) {
        this.disputeId = builder.disputeId;
        this.description = builder.description;
        this.disputeDate = builder.disputeDate;
        this.disputeStatus = builder.disputeStatus;
    }

    public String getDisputeId() {
        return disputeId;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDisputeDate() {
        return disputeDate;
    }

    public DisputeStatus getDisputeStatus() {
        return disputeStatus;
    }

    @Override
    public String toString() {
        return "Dispute{" +
                "disputeId='" + disputeId + '\'' +
                ", description='" + description + '\'' +
                ", disputeDate=" + disputeDate +
                ", disputeStatus=" + disputeStatus +
                '}';
    }

    public static class Builder {
        private String disputeId;
        private String description;
        private LocalDate disputeDate;
        private DisputeStatus disputeStatus;

        public Builder setDisputeId(String disputeId) {
            this.disputeId = disputeId;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDisputeDate(LocalDate disputeDate) {
            this.disputeDate = disputeDate;
            return this;
        }

        public Builder setDisputeStatus(DisputeStatus disputeStatus) {
            this.disputeStatus = disputeStatus;
            return this;
        }

        public Builder copy(Dispute dispute) {
            this.disputeId = dispute.disputeId;
            this.description = dispute.description;
            this.disputeDate = dispute.disputeDate;
            this.disputeStatus = dispute.disputeStatus;
            return this;
        }

        public Dispute build() {
            return new Dispute(this);
        }
    }
}
