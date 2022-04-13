package uz.pdp.ware_house.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.ware_house.entity.Client;
import uz.pdp.ware_house.entity.Currency;
import uz.pdp.ware_house.projections.CustomClient;
import uz.pdp.ware_house.projections.CustomCurrency;

@RepositoryRestResource(path = "currency",excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {

}
