package mediasoftts.service.mapper;

import mediasoftts.dto.city.CityDto;
import mediasoftts.entity.City;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CityMapper {

    public Mono<CityDto> mapCityToMonoCityDto(City model) {
        return Mono.justOrEmpty(new CityDto(
                model.getNameCity(),
                model.getCountPeople()
        ));

    }

    public Flux<CityDto> mapCityToFluxCityDto(Flux<City> model) {
        return Flux.fromStream(model
                .flatMap(this::mapCityToMonoCityDto)
                .toStream());
    }
}
