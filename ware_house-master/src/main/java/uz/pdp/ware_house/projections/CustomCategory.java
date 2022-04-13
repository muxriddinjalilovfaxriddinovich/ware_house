package uz.pdp.ware_house.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ware_house.entity.Category;
import uz.pdp.ware_house.entity.Currency;

@Projection(types = Category.class)
public interface CustomCategory {

    String getName();

    Integer getId();

    boolean getActive();

    Category getCategory();

}
