package uz.pdp.ware_house.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ware_house.entity.Output;
import uz.pdp.ware_house.entity.OutputProduct;
import uz.pdp.ware_house.entity.Product;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {

    Integer getId();

    Product getProduct();

    double getAmount();

    double getPrice();

    Output getOutput();
}
