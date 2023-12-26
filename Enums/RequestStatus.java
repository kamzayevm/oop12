package src.Enums;

public enum RequestStatus {
    APPROVED("Approved"), 
    REJECTED("Rejected"), 
    COMPLETED("Completed"), 
    FAILED("Failed");

    private final String status;

    RequestStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public static RequestStatus of(String status) {
        for (RequestStatus requestStatus : RequestStatus.values()) {
            if (requestStatus.status.equalsIgnoreCase(status)) {
                return requestStatus;
            }
        }
        return null;
    }
}
