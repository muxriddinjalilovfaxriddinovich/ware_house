package uz.pdp.ware_house.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ware_house.entity.Client;
import uz.pdp.ware_house.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupllier {


    Integer getId();

    String getName();

    String getPhoneNumber();

    boolean getActive();


}
