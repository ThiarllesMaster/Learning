package learning.client.binder;

import learning.client.place.CustomerPlace;
import learning.resources.MyResources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class Home extends Composite implements HomeView {

    private static HomeUiBinder uiBinder = GWT.create(HomeUiBinder.class);

    @UiField
    HorizontalPanel panel;

    @UiField
    Anchor anchorCustomer;

    @UiField
    Anchor financeLink;

    @UiField
    Anchor studentLink;

    @UiField
    Anchor materialLink;

    @UiField
    VerticalPanel verticalPanelRight;

    @UiField
    VerticalPanel verticalPanelLeft;

    Presenter presenter;



    interface HomeUiBinder extends UiBinder<Widget, Home> {
    }

    public Home() {
        initWidget(uiBinder.createAndBindUi(this));

        panel.addStyleName("panelLeft");

        Image iconCustomer = new Image(MyResources.INSTANCE.customer());
        anchorCustomer.addStyleName("default");
        anchorCustomer.setText("Customer's Service");

        Image iconFinance = new Image(MyResources.INSTANCE.finance());
        iconFinance.addStyleName("image");
        financeLink.addStyleName("default");
        financeLink.setText("Finance Department");
        
        verticalPanelLeft.add(iconCustomer);
        verticalPanelLeft.add(anchorCustomer);
        verticalPanelLeft.add(iconFinance);
        verticalPanelLeft.add(financeLink);


        Image studentIcon = new Image(MyResources.INSTANCE.attendees());
        Image materialsIcon = new Image(MyResources.INSTANCE.materials());
        materialsIcon.addStyleName("image");

        verticalPanelRight.addStyleName("panelRight");

        verticalPanelRight.add(studentIcon);

        studentLink.addStyleName("studentLink");
        studentLink.setText("Students");
        verticalPanelRight.add(studentLink);
        verticalPanelRight.add(materialsIcon);
        materialLink.setText("Materials");
        materialLink.addStyleName("default");
        verticalPanelRight.add(materialLink);

        panel.add(verticalPanelLeft);
        panel.add(verticalPanelRight);


    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;

    }

    @UiHandler("anchorCustomer")
    public void navigateCustomer(ClickEvent event) {
        presenter.goTo(new CustomerPlace());

    }






}
