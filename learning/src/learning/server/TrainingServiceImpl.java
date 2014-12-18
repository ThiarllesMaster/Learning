package learning.server;

import static learning.server.OfyService.ofy;
import learning.client.TrainingService;
import learning.domain.Training;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class TrainingServiceImpl extends RemoteServiceServlet implements TrainingService {


    private static final long serialVersionUID = -6335180591505670833L;

    @Override
    public void createTraining(String nameTraining, String type, String reason) {
        Training training = new Training();

        training.setTrainingName(nameTraining);
        training.setType(type);
        training.setReason(reason);

        ofy().save().entities(training).now();

    }


}
