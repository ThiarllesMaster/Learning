package learning.client.binder;


import learning.client.TimeService;
import learning.client.TimeServiceAsync;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class Formulario extends Composite {

    private static FormularioUiBinder uiBinder = GWT.create(FormularioUiBinder.class);

    TimeServiceAsync service = GWT.create(TimeService.class);

    interface FormularioUiBinder extends UiBinder<Widget, Formulario> {
    }

    public Formulario() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiField
    Button button;

    @UiField
    TextBox day;

    @UiField
    TextBox arrive;


    @UiField
    TextBox exit;



    public Formulario(String firstName) {
        initWidget(uiBinder.createAndBindUi(this));
        button.setText(firstName);
    }

    @UiHandler("button")
    void onClick(ClickEvent e) {
        service.saveTime(day.getText(), arrive.getText(), exit.getText(),
            new AsyncCallback<Void>() {

            @Override
            public void onFailure(Throwable caught) {
                    Window.alert("Problem in register your day :(");

            }

            @Override
            public void onSuccess(Void result) {
                    Window.alert("Operation Success");

            }
        });
    }


}
