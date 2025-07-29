package za.co.admatech.domain.enums;
//222134763;
public enum NotificationType {
    JOB_POSTED("Job Posted");
    JOB_ACCEPTED("Job Accepted");
    JOB_REJECTED("Job Rejected");
    JOB_COMPLETED("Job Completed");
    JOB_CANCELLED("Job Cancelled");

    private final String description;

    NotificationType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        NotificationType notification = NotificationType.JOB_POSTED;
        System.out.println("Notification Type: " + notification.getDescription());
    }

}