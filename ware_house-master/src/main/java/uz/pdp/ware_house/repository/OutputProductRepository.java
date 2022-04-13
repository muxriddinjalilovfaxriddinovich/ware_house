package uz.pdp.ware_house.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.ware_house.entity.OutputProduct;
import uz.pdp.ware_house.projections.CustomOutputProduct;

@RepositoryRestResource(path = "outputProduct",excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {
}
