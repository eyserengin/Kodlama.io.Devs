package com.example.Kodlama.io.Devs.dataAccess.abtracts;

import com.example.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PLRepository extends JpaRepository<ProgramingLanguage, Integer> {}
