package com.example.Kodlama.io.Devs.entities.concretes;




import lombok.*;
import javax.persistence.*;
import java.util.List;


@Table(name = "programingLanguages")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ProgramingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;


    @OneToMany(mappedBy="programingLanguage")
    private List<SubTechnologyLanguage> subTechnologyLanguages;

}
