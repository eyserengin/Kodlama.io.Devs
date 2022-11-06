package com.example.Kodlama.io.Devs.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "SubTechs")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

public class SubTechnologyLanguage {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private ProgramingLanguage programingLanguage;

}
