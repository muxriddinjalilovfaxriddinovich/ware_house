package uz.pdp.ware_house.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.ware_house.entity.Input;
import uz.pdp.ware_house.projections.CustomInput;

@RepositoryRestResource(path = "input",excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input,Integer> {
}
