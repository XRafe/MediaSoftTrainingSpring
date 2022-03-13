package mediasoftts.service;

import mediasoftts.dto.city.CityCreateDto;
import mediasoftts.dto.city.CityDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface CityService {

    Mono<CityDto> addCity(CityCreateDto cityCreateDto);

    Flux<CityDto> getAllCity();
}
