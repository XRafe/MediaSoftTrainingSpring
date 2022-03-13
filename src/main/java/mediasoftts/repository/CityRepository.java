package mediasoftts.repository;

import mediasoftts.entity.City;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends R2dbcRepository<City, Integer>{
}
