package learning.client.mapper;

import learning.client.ClientFactory;
import learning.client.activity.CustomerActivity;
import learning.client.activity.HomeActivity;
import learning.client.place.CustomerPlace;
import learning.client.place.FinancePlace;
import learning.client.place.HomePlace;

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

        } else if (place instanceof CustomerPlace) {
            return new CustomerActivity(factory, (CustomerPlace) place);

        }
        return null;
    }



}
