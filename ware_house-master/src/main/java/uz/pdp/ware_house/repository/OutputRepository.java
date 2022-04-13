package uz.pdp.ware_house.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.ware_house.entity.Input;
import uz.pdp.ware_house.entity.Output;
import uz.pdp.ware_house.projections.CustomInput;
import uz.pdp.ware_house.projections.CustomOutput;

@RepositoryRestResource(path = "output",excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output,Integer> {
}
