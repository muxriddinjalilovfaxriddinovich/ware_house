package uz.pdp.ware_house.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ware_house.entity.Currency;
import uz.pdp.ware_house.entity.WareHouse;

@Projection(types = WareHouse.class)
public interface CustomWarehouse {

    String getName();

    Integer getId();

    boolean getActive();

}
