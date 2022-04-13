package uz.pdp.ware_house.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ware_house.entity.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {

    String getName();

    Integer getId();

    boolean getActive();
}
