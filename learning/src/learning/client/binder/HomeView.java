package learning.client.binder;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface HomeView extends IsWidget {

    void setPresenter(Presenter presenter);
    
    /**
     * Navigation rule
     * @author thiarlles.gomes
     *
     */
    public interface Presenter {
        void goTo(Place place);

    }

}
