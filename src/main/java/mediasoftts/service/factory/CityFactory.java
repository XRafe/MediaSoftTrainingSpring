package mediasoftts.service.factory;

import mediasoftts.entity.City;
import org.springframework.stereotype.Component;

@Component
public class CityFactory {
    public City build(String nameCity, Integer countPeople) {
        return new City(nameCity, countPeople);
    }
}
