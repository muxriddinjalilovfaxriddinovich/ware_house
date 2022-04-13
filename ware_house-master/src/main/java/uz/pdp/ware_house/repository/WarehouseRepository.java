package uz.pdp.ware_house.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.ware_house.entity.Currency;
import uz.pdp.ware_house.entity.WareHouse;
import uz.pdp.ware_house.projections.CustomCurrency;
import uz.pdp.ware_house.projections.CustomWarehouse;

@RepositoryRestResource(path = "wareHouse",excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<WareHouse,Integer> {

}
