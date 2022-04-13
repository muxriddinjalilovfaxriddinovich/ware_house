package uz.pdp.ware_house.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.ware_house.entity.Attachment;
import uz.pdp.ware_house.entity.Currency;
import uz.pdp.ware_house.projections.CustomAttachment;

@RepositoryRestResource(path = "attachment",excerptProjection = CustomAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {

}
