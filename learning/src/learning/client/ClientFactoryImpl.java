package learning.client;

import learning.client.binder.Home;
import learning.client.binder.HomeView;
import learning.client.binder.TrainingManagementUI;
import learning.client.binder.TrainingManagementViewImpl;
import learning.client.binder.TrainingView;
import learning.client.binder.TrainingViewImpl;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;


public class ClientFactoryImpl implements ClientFactory{
    
    private static final EventBus eventBus = new SimpleEventBus();
    @SuppressWarnings("deprecation")
    private static final PlaceController placeController = new PlaceController(eventBus);
    private static final HomeView home = new Home();
    private static final TrainingView customerView = new TrainingViewImpl();
    private static final TrainingManagementUI traininingManagementUI =
        new TrainingManagementViewImpl();

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
    public TrainingView getCustomerView() {
        return customerView;
    }

    @Override
    public TrainingManagementUI getTrainingManagementUI() {
        return traininingManagementUI;
    }
    
    


}
