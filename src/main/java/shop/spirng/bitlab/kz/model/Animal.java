package shop.spirng.bitlab.kz.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "animals")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "animalType_id")
    private AnimalType animalType;

    @Column(name = "price")
    private double price;

    @Column(name = "color")
    private String color;

    @Column(name = "age")
    private int age;

    @Column(name = "aboutAnimal")
    private String aboutAnimal;
}
