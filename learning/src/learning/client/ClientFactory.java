package learning.client;

import learning.client.binder.HomeView;
import learning.client.binder.TrainingManagementUI;
import learning.client.binder.TrainingView;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;

public interface ClientFactory {

    EventBus getEventBus();

    PlaceController getPlaceController();

    HomeView getHome();

    TrainingView getCustomerView();

    TrainingManagementUI getTrainingManagementUI();



}
