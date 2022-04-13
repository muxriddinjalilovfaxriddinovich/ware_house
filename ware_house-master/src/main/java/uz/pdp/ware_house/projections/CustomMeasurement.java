package uz.pdp.ware_house.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ware_house.entity.Currency;
import uz.pdp.ware_house.entity.Measurement;

@Projection(types = Measurement.class)
public interface CustomMeasurement {

    String getName();

    Integer getId();

    boolean getActive();
}
