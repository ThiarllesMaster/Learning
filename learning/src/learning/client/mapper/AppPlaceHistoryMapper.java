package learning.client.mapper;

import learning.client.place.HomePlace;
import learning.client.place.TrainingManagementPlace;
import learning.client.place.TrainingPlace;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({HomePlace.Tokenizer.class, TrainingPlace.Tokenizer.class,
    TrainingManagementPlace.Tokenizer.class})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {

}
