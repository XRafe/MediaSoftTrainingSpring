package mediasoftts.service.impl;

import mediasoftts.dto.city.CityCreateDto;
import mediasoftts.dto.city.CityDto;
import mediasoftts.entity.City;
import mediasoftts.repository.CityRepository;
import mediasoftts.service.CityService;
import mediasoftts.service.factory.CityFactory;
import mediasoftts.service.mapper.CityMapper;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class JpaCity implements CityService {

    private final CityMapper cityMapper;
    private final CityFactory cityFactory;
    private final CityRepository cityRepository;

    public JpaCity(CityMapper cityMapper, CityFactory cityFactory, CityRepository cityRepository) {
        this.cityMapper = cityMapper;
        this.cityFactory = cityFactory;
        this.cityRepository = cityRepository;
    }

    @Override
    public Mono<CityDto> addCity(CityCreateDto cityCreateDto) {
        City city = cityFactory.build(
                cityCreateDto.getNameCity(),
                cityCreateDto.getCountPeople()
        );
        cityRepository.save(city);

        return cityMapper.mapCityToMonoCityDto(city);
    }

    @Override
    public Flux<CityDto> getAllCity() {
        Flux<City> cities = cityRepository.findAll();
        return cityMapper.mapCityToFluxCityDto(cities);
    }
}
