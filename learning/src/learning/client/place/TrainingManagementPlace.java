package learning.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class TrainingManagementPlace extends Place {

    public static class Tokenizer implements PlaceTokenizer<TrainingManagementPlace> {

        @Override
        public TrainingManagementPlace getPlace(String token) {
            return null;
        }

        @Override
        public String getToken(TrainingManagementPlace place) {
            return "trainingManagement";
        }

    }

}
