package learning.client;

import learning.client.binder.Home;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Learning implements EntryPoint {



    public void onModuleLoad() {
        Home home = new Home();
        RootPanel.get("panel").add(home);


    }
}
