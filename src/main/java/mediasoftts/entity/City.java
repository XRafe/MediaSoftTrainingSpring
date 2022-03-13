package mediasoftts.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class City {

    @Id
    @SequenceGenerator(name = "city_id_seq_generator",
            sequenceName = "city_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "city_id_seq_generator")
    private Integer id;

    private String nameCity;

    private Integer countPeople;

    public City(String nameCity, Integer countPeople) {
        this.nameCity = nameCity;
        this.countPeople = countPeople;
    }
}
