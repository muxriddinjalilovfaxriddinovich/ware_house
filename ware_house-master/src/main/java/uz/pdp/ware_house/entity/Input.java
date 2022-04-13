package uz.pdp.ware_house.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Input {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    private Date date;

    @ManyToOne
    private WareHouse wareHouse;

    @ManyToOne
    private Supplier supplier;

    @ManyToOne
    private Currency currency;

    private UUID factureNumber;

    private String code;

}
