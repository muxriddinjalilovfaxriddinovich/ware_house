package uz.pdp.ware_house.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor@NoArgsConstructor@Getter
@Setter
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private boolean active;

    @ManyToOne
    private Category category;

    @OneToOne
    private Attachment photo;

    private String code;

    @ManyToOne
    private Measurement measurement;
    


}
