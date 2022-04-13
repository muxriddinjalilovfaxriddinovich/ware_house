package uz.pdp.ware_house.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.ware_house.entity.Client;
import uz.pdp.ware_house.entity.Supplier;
import uz.pdp.ware_house.projections.CustomClient;
import uz.pdp.ware_house.projections.CustomSupllier;

@RepositoryRestResource(path = "supplier",excerptProjection = CustomSupllier.class)
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {

}
