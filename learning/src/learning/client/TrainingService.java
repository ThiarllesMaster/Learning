package learning.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath(value = "trainingService")
public interface TrainingService extends RemoteService {

    void createTraining(String nameTraining, String type, String reason);

}
