package mediasoftts.dto.city;

import lombok.Getter;
import org.springframework.web.bind.annotation.RequestBody;

@Getter
public class CityDto {
    private final String nameCity;

    private final Integer countPeople;

    public CityDto(@RequestBody String nameCity,
                   @RequestBody Integer countPeople) {
        this.nameCity = nameCity;
        this.countPeople = countPeople;
    }
}
