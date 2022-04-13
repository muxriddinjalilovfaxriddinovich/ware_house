package uz.pdp.ware_house.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.ware_house.entity.Currency;
import uz.pdp.ware_house.entity.Measurement;
import uz.pdp.ware_house.projections.CustomCurrency;

@RepositoryRestResource(path = "measurement",excerptProjection = Measurement.class)
public interface MeasurementRepository extends JpaRepository<Currency,Integer> {

}
