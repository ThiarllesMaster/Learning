package learning.client.activity;

import learning.client.ClientFactory;
import learning.client.binder.TrainingManagementUI;
import learning.client.binder.TrainingManagementUI.Presenter;
import learning.client.place.TrainingManagementPlace;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class TrainingManagementActivity extends AbstractActivity implements
    TrainingManagementUI.Presenter {

    private ClientFactory clientFactory;
    private TrainingManagementPlace trainingManagementPlace;

    public TrainingManagementActivity(ClientFactory clientFactory,
        TrainingManagementPlace trainingManagementPlace) {
        this.clientFactory = clientFactory;
        this.trainingManagementPlace = trainingManagementPlace;

    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        TrainingManagementUI trainingManagementUI = clientFactory.getTrainingManagementUI();
        trainingManagementUI.setPresenter(this);
        panel.setWidget(trainingManagementUI);


    }

    @Override
    public void goTo(Presenter presenter) {
        clientFactory.getPlaceController().goTo(trainingManagementPlace);


    }



}
