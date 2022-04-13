package uz.pdp.ware_house.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;

    private String code;

    private String password;

    private String phoneNumber;

    private boolean active;

    @ManyToMany
    List<WareHouse> wareHouses;


}
