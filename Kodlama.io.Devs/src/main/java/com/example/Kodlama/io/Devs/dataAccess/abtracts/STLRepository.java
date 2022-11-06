package com.example.Kodlama.io.Devs.dataAccess.abtracts;


import com.example.Kodlama.io.Devs.entities.concretes.SubTechnologyLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface STLRepository extends JpaRepository<SubTechnologyLanguage, Integer> {}
