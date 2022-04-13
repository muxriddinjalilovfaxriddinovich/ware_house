package uz.pdp.ware_house.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ware_house.entity.Attachment;
import uz.pdp.ware_house.entity.Currency;

@Projection(types = Attachment.class)
public interface CustomAttachment {
    Integer getId();

    String getName();

    long getSize();

    String getContentType();

}
