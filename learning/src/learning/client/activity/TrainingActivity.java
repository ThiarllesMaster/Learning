package learning.client.activity;

import learning.client.ClientFactory;
import learning.client.binder.TrainingView;
import learning.client.place.TrainingPlace;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class TrainingActivity extends AbstractActivity implements TrainingView.Presenter {

    private ClientFactory clientFactory;


    public TrainingActivity(ClientFactory clientFactory, TrainingPlace customerPlace) {
        this.clientFactory = clientFactory;

    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        TrainingView customerView = clientFactory.getCustomerView();
        customerView.setPresenter(this);
        panel.setWidget(customerView);
    }

    @Override
    public void goTo(Place place) {
        clientFactory.getPlaceController().goTo(place);

    }



}
