package uz.pdp.ware_house.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ware_house.entity.Attachment;
import uz.pdp.ware_house.entity.AttachmentContent;
import uz.pdp.ware_house.entity.Currency;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {

    Integer getId();

    String getBytes();


    Attachment getAttachment();


}
