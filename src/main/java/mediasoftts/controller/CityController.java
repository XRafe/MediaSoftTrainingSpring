package mediasoftts.controller;

import mediasoftts.dto.city.CityCreateDto;
import mediasoftts.dto.city.CityDto;
import mediasoftts.service.CityService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cities")
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @PostMapping
    public Mono<CityDto> addCity(@RequestBody CityCreateDto cityCreateDto) {
        return cityService.addCity(cityCreateDto);
    }

    @GetMapping
    public Flux<CityDto> getAllCity() {
        return cityService.getAllCity();
    }
}
