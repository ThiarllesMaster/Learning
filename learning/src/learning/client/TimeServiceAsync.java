package learning.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface TimeServiceAsync {

    void saveTime(String day, String arrive, String exit, AsyncCallback<Void> callback);

}
