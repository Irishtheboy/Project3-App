package za.co.admatech.domain.enums;

public enum JobStatus {
    OPEN ("Open"),
    ACCEPTED ("Accepted"),
    REJECTED ("Rejected"),
    COMPLETED ("Completed"),
    CANCELLED ("Cancelled");

    private final String status;

    JobStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return status;
    }
}
