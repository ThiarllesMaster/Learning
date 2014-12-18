package learning.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface TrainingServiceAsync {

    void createTraining(String nameTraining, String type, String reason,
        AsyncCallback<Void> callback);

}
