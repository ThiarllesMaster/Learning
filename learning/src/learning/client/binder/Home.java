package learning.client.binder;

import learning.resources.MyResources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class Home extends Composite {

    private static HomeUiBinder uiBinder = GWT.create(HomeUiBinder.class);

    @UiField
    HTMLPanel panel;

    @UiField
    HorizontalPanel content;


    interface HomeUiBinder extends UiBinder<Widget, Home> {
    }

    public Home() {
        initWidget(uiBinder.createAndBindUi(this));
        Label title = new Label("Learning system using GWT");
        title.addStyleName("label");
        panel.add(title);

        // First Panel Elements...
        VerticalPanel panelOne = new VerticalPanel();
        panelOne.addStyleName("firstPanel");
        Image customerIcon = new Image(MyResources.INSTANCE.customer());
        panelOne.add(customerIcon);

        Anchor linkServiceCustomer = new Anchor();
        linkServiceCustomer.setText("Customers");

        panelOne.add(linkServiceCustomer);

        Image financeIcon = new Image(MyResources.INSTANCE.finance());
        financeIcon.addStyleName("financeIcon");
        panelOne.add(financeIcon);

        Anchor financeLink = new Anchor();
        financeLink.setText("Finance Department");

        panelOne.add(financeLink);


        // Second Panel Elements...
        VerticalPanel panelTwoPanel = new VerticalPanel();
        panelTwoPanel.addStyleName("secondPanel");

        Image atendeers = new Image(MyResources.INSTANCE.attendees());
        panelTwoPanel.add(atendeers);

        Anchor studentLink = new Anchor("Students");
        studentLink.addStyleName("studentLink");
        studentLink.setText("Students");

        panelTwoPanel.add(studentLink);

        Image materialsIcon = new Image(MyResources.INSTANCE.materials());
        materialsIcon.addStyleName("materialink");

        Anchor materialLink = new Anchor();
        materialLink.addStyleName("linkMaterial");
        materialLink.setText("Materials");

        panelTwoPanel.add(materialsIcon);
        panelTwoPanel.add(materialLink);


        content.add(panelOne);
        content.add(panelTwoPanel);

        panel.add(content);

    }



}
