package uz.pdp.ware_house.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ware_house.entity.Category;
import uz.pdp.ware_house.entity.Currency;
import uz.pdp.ware_house.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {

    String getName();

    Integer getId();

    boolean getActive();

    String getCode();

    Category getCategory();

    String getPhoto();

    String getMeasurement();
}
