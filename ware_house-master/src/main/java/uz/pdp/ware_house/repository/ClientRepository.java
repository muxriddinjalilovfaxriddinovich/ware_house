package uz.pdp.ware_house.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.ware_house.entity.Client;
import uz.pdp.ware_house.projections.CustomClient;

@RepositoryRestResource(path = "clients",excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {

}
