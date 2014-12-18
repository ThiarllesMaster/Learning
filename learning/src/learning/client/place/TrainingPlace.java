package learning.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class TrainingPlace extends Place {

    public static class Tokenizer implements PlaceTokenizer<TrainingPlace> {

        @Override
        public TrainingPlace getPlace(String token) {
            return new TrainingPlace();
        }

        @Override
        public String getToken(TrainingPlace place) {
            return "training";
        }

    }


}
