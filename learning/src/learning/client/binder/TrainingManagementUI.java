package learning.client.binder;

import com.google.gwt.user.client.ui.IsWidget;

public interface TrainingManagementUI extends IsWidget {

    void setPresenter(Presenter presenter);

    public interface Presenter {
        void goTo(Presenter presenter);
    }

}
