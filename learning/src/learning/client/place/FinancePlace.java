package learning.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class FinancePlace extends Place {

    public static class Tokenizer implements PlaceTokenizer<FinancePlace> {

        @Override
        public FinancePlace getPlace(String token) {
            return null;
        }

        @Override
        public String getToken(FinancePlace place) {
            return null;
        }


    }

}
