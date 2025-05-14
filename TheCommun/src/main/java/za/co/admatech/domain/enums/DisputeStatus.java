package za.co.admatech.domain.enums;

public enum DisputeStatus {
    OPEN("Open"),
    IN_REVIEW("In Review"),
    RESOLVED("Resolved"),
    CLOSED("Closed");

    private final String status;

    DisputeStatus(String status) {
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
