package learning.client.binder;

import learning.client.place.TrainingManagementPlace;
import learning.resources.MyResources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class TrainingViewImpl extends Composite implements TrainingView {

    private static CustomerViewImplUiBinder uiBinder = GWT.create(CustomerViewImplUiBinder.class);

    interface CustomerViewImplUiBinder extends UiBinder<Widget, TrainingViewImpl> {
    }

    @UiField
    HTMLPanel panel;

    @UiField
    Anchor createTraining;

    Presenter presenter;

    VerticalPanel panelLeft = null;


    public TrainingViewImpl() {
        initWidget(uiBinder.createAndBindUi(this));

        panelLeft = new VerticalPanel();
        panelLeft.addStyleName("panelLeft");

        Image imageRegisterUsers = new Image(MyResources.INSTANCE.getTraining());
        createTraining.setText("New Training");

        panelLeft.add(imageRegisterUsers);
        createTraining.addStyleName("default");
        panelLeft.add(createTraining);

        panel.add(panelLeft);

    }


    @UiHandler("createTraining")
    public void createTraining(ClickEvent event) {
        presenter.goTo(new TrainingManagementPlace());

    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;

    }


}
