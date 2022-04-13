package uz.pdp.ware_house.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ware_house.entity.Client;

@Projection(types = Client.class)
public interface CustomClient {


    Integer getId();

    String getName();

    String getPhoneNumber();


}
