package learning.client;

import learning.client.binder.Formulario;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Learning implements EntryPoint {

	public void onModuleLoad() {
        Formulario f = new Formulario();
        RootPanel.get("panel").add(f);
	}
}
