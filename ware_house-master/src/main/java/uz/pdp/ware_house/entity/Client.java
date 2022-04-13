package uz.pdp.ware_house.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor@NoArgsConstructor@Getter
@Setter
@ToString
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String phoneNumber;



}
