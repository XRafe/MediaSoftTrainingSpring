package mediasoftts.dto.city;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class CityCreateDto {
    private final String nameCity;

    private final Integer countPeople;

    public CityCreateDto(@JsonProperty String nameCity,
                         @JsonProperty Integer countPeople) {
        this.nameCity = nameCity;
        this.countPeople = countPeople;
    }
}
