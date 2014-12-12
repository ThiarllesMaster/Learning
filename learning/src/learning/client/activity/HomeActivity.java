package learning.client.activity;

import learning.client.ClientFactory;
import learning.client.binder.HomeView;
import learning.client.place.HomePlace;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class HomeActivity extends AbstractActivity 
implements HomeView.Presenter {

    private ClientFactory clientFactory;
    private HomePlace homePlace;

    public HomeActivity(ClientFactory clientFactory, HomePlace homePlace) {
        this.clientFactory = clientFactory;
        this.homePlace = homePlace;

    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        HomeView home = clientFactory.getHome();
        home.setPresenter(this);
        panel.setWidget(home);

    }

    @Override
    public void goTo(Place place) {
        clientFactory.getPlaceController().goTo(place);


    }


    
}
