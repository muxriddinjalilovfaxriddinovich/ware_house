package uz.pdp.ware_house.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.ware_house.entity.Attachment;
import uz.pdp.ware_house.projections.CustomAttachment;
import uz.pdp.ware_house.projections.CustomAttachmentContent;

@RepositoryRestResource(path = "attachment_content",excerptProjection = CustomAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<Attachment,Integer> {

}
