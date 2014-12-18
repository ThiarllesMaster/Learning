package learning.client.binder;

import com.google.gwt.user.client.ui.IsWidget;

public interface CreateTraining extends IsWidget {

    public interface Place {
        void goTo(Place place);
    }
}
