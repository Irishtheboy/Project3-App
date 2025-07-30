package za.co.admatech.factory;

import za.co.admatech.domain.enums.DisputeStatus;

222134763;
public class DisputeStatusFactory {

    public static DisputeStatus createInReviewStatus() {
        return DisputeStatus.IN_REVIEW;
    }

    public static DisputeStatus createResolvedStatus() {
        return DisputeStatus.RESOLVED;
    }

    public static DisputeStatus createRejectedStatus() {
        return DisputeStatus.REJECTED;
    }

    public static DisputeStatus createClosedStatus() {
        return DisputeStatus.CLOSED;
    }

    public static DisputeStatus createOpenStatus() {
        return DisputeStatus.OPEN;
    }
}
