package learning.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface MyResources extends ClientBundle {

    MyResources INSTANCE = GWT.create(MyResources.class);

    @Source("customer.png")
    ImageResource customer();

    @Source("iconsFinance.png")
    ImageResource finance();

    @Source("atendeers.png")
    ImageResource attendees();

    @Source("materials.png")
    ImageResource materials();

}
