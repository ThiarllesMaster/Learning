package learning.client.mapper;

import learning.client.ClientFactory;
import learning.client.activity.HomeActivity;
import learning.client.activity.TrainingActivity;
import learning.client.activity.TrainingManagementActivity;
import learning.client.place.FinancePlace;
import learning.client.place.HomePlace;
import learning.client.place.TrainingManagementPlace;
import learning.client.place.TrainingPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class AppActivityMapper implements ActivityMapper {

    private ClientFactory factory;

    public AppActivityMapper(ClientFactory factory) {
        super();
        this.factory = factory;

    }

    /**
     * This method is called in each time that one Place is created
     */
    @Override
    public Activity getActivity(Place place) {
        if (place instanceof HomePlace) {
            return new HomeActivity(factory, (HomePlace) place);

        } else if (place instanceof FinancePlace) {

        } else if (place instanceof TrainingPlace) {
            return new TrainingActivity(factory, (TrainingPlace) place);

        } else if (place instanceof TrainingManagementPlace) {
            return new TrainingManagementActivity(factory, (TrainingManagementPlace) place);


        }
        return null;
    }



}
