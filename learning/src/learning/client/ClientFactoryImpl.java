package learning.client;

import learning.client.binder.CustomerView;
import learning.client.binder.CustomerViewImpl;
import learning.client.binder.Home;
import learning.client.binder.HomeView;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;


public class ClientFactoryImpl implements ClientFactory{
    
    private static final EventBus eventBus = new SimpleEventBus();
    @SuppressWarnings("deprecation")
    private static final PlaceController placeController = new PlaceController(eventBus);
    private static final HomeView home = new Home();
    private static final CustomerView customerView = new CustomerViewImpl();

    @Override
    public EventBus getEventBus() {
        return eventBus;
    }

    @Override
    public PlaceController getPlaceController() {
        return placeController;
    }

    @Override
    public HomeView getHome() {
        return home;
    }

    @Override
    public CustomerView getCustomerView() {
        return customerView;
    }
    
    


}
