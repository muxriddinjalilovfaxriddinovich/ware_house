package uz.pdp.ware_house.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ware_house.entity.InputProduct;
import uz.pdp.ware_house.entity.Output;
import uz.pdp.ware_house.entity.OutputProduct;
import uz.pdp.ware_house.entity.Product;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    Integer getId();

    Product getProduct();

    double getAmount();

    double getPrice();

    Output getInput();

    Date getExpireDate();
}
