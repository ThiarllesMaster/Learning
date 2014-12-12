package learning.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class CustomerPlace extends Place {

    public static class Tokenizer implements PlaceTokenizer<CustomerPlace> {

        @Override
        public CustomerPlace getPlace(String token) {
            return new CustomerPlace();
        }

        @Override
        public String getToken(CustomerPlace place) {
            return "customer";
        }

    }


}
