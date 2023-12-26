package src.Library;

import src.RequestSystem.Request;

public interface ManageRequest {
    Request getRequest();
    boolean respondRequest();

}