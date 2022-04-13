package uz.pdp.ware_house.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.ware_house.entity.InputProduct;
import uz.pdp.ware_house.entity.OutputProduct;
import uz.pdp.ware_house.projections.CustomInputProduct;
import uz.pdp.ware_house.projections.CustomOutputProduct;

@RepositoryRestResource(path = "inputProduct",excerptProjection = CustomInputProduct.class)

public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {
}
