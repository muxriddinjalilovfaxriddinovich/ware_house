package uz.pdp.ware_house.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.ware_house.entity.Currency;
import uz.pdp.ware_house.entity.Product;
import uz.pdp.ware_house.projections.CustomCurrency;
import uz.pdp.ware_house.projections.CustomProduct;

@RepositoryRestResource(path = "product",excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
