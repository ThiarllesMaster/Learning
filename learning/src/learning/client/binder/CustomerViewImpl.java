package learning.client.binder;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class CustomerViewImpl extends Composite implements CustomerView {

    private static CustomerViewImplUiBinder uiBinder = GWT.create(CustomerViewImplUiBinder.class);

    interface CustomerViewImplUiBinder extends UiBinder<Widget, CustomerViewImpl> {
    }

    public CustomerViewImpl() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiField
    Button button;

    Presenter presenter;

    public CustomerViewImpl(String firstName) {
        initWidget(uiBinder.createAndBindUi(this));
        button.setText(firstName);
    }

    @UiHandler("button")
    void onClick(ClickEvent e) {
        Window.alert("Hello!");
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;

    }


}
