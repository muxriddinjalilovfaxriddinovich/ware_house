package uz.pdp.ware_house.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ware_house.entity.Users;
import uz.pdp.ware_house.entity.WareHouse;

import java.util.List;

@Projection(types = Users.class)
public interface CustomUser {


    Integer getId();

    String getFirstName();

    String getLastName();

    String getCode();

    String getPassword();

    boolean getActive();

    String getPhoneNumber();

    List<WareHouse> getWareHouses();


}
