package uz.pdp.ware_house.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ware_house.entity.Currency;
import uz.pdp.ware_house.entity.Input;
import uz.pdp.ware_house.entity.Supplier;
import uz.pdp.ware_house.entity.WareHouse;

import java.util.Date;
import java.util.UUID;

@Projection(types = Input.class)
public interface CustomInput {

    Integer getId();

    Date getDate();

    WareHouse getWareHouse();

    Supplier getSupplier();

    Currency getCurrency();

    UUID getFactureNumber();

    String getCode();

}
