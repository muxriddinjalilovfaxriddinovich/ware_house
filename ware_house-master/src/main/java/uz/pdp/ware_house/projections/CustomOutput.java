package uz.pdp.ware_house.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ware_house.entity.*;

import java.util.Date;
import java.util.UUID;

@Projection(types = Output.class)
public interface CustomOutput {

    Integer getId();

    Date getDate();

    WareHouse getWareHouse();

    Supplier getClient();

    Currency getCurrency();

    UUID getFactureNumber();

    String getCode();

}
