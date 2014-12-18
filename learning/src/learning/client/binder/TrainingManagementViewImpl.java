package learning.client.binder;

import learning.client.TrainingService;
import learning.client.TrainingServiceAsync;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class TrainingManagementViewImpl extends Composite implements TrainingManagementUI {

    private static TrainingManaggementViewImplUiBinder uiBinder = GWT
        .create(TrainingManaggementViewImplUiBinder.class);

    interface TrainingManaggementViewImplUiBinder extends
        UiBinder<Widget, TrainingManagementViewImpl> {
    }

    @UiField
    HTMLPanel panelTraining;

    TextBox nameTraining;
    ListBox typeList;
    TextBox reason;

    @UiField
    Button createTraining;

    @UiField
    Button listTraining;

    TrainingServiceAsync trainingService = GWT.create(TrainingService.class);

    Presenter presenter;
    
    public TrainingManagementViewImpl() {
        initWidget(uiBinder.createAndBindUi(this));
        panelTraining.addStyleName("panelTraining");
        nameTraining = new TextBox();
        nameTraining.addStyleName("inputTraining");
        typeList = new ListBox();

        VerticalPanel panel = new VerticalPanel();
        panel.add(new Label("Training Name:"));
        panel.add(nameTraining);
        panel.add(new Label("Type:"));
        typeList.addItem("A priori");
        typeList.addItem("A posteriori");

        panel.add(typeList);
        panel.add(new Label("Reason"));
        reason = new TextBox();
        reason.addStyleName("inputTraining");

        panel.add(reason);
        HorizontalPanel buttonPanels = new HorizontalPanel();
        buttonPanels.addStyleName("panelButtonsTraining");
        buttonPanels.add(createTraining);
        listTraining.addStyleName("buttonList");
        buttonPanels.add(listTraining);


        panelTraining.add(panel);
        panelTraining.add(buttonPanels);


    }


    public TrainingManagementViewImpl(String firstName) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("createTraining")
    public void registerTraining(ClickEvent event) {
        int indice = typeList.getSelectedIndex();
        trainingService.createTraining(nameTraining.getText(), typeList.getItemText(indice),
            reason.getText(), new AsyncCallback<Void>() {
                @Override
                public void onSuccess(Void result) {

                }

                @Override
                public void onFailure(Throwable caught) {


                }
            });

        /*
         * trainingService.createTraining(nameTraining.getText(), typeList.getItemText(indice),
         * reason.getText());
         */

    }


    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;

    }


}
