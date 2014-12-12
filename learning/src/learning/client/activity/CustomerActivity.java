package learning.client.activity;

import learning.client.ClientFactory;
import learning.client.binder.CustomerView;
import learning.client.place.CustomerPlace;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class CustomerActivity extends AbstractActivity implements CustomerView.Presenter {

    private ClientFactory clientFactory;


    public CustomerActivity(ClientFactory clientFactory, CustomerPlace customerPlace) {
        this.clientFactory = clientFactory;

    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        CustomerView customerView = clientFactory.getCustomerView();
        customerView.setPresenter(this);
        panel.setWidget(customerView);
    }

    @Override
    public void goTo(Place place) {
        clientFactory.getPlaceController().goTo(place);

    }



}
