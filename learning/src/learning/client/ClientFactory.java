package learning.client;

import learning.client.binder.CustomerView;
import learning.client.binder.HomeView;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;

public interface ClientFactory {

    EventBus getEventBus();

    PlaceController getPlaceController();

    HomeView getHome();

    CustomerView getCustomerView();


}
