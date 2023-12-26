package src.UserSystem;

import src.RequestSystem.Request;

public interface ManageRequest {
    void manageRequest(Request request);
    void approveRequest(Request request);
    void rejectRequest(Request request);
    void viewAllRequests();
}
