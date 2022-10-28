package com.example.Kodlama.io.Devs.dataAccess.abtracts;

import com.example.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;

import java.util.List;

public interface PLRepository {

    List<ProgramingLanguage> getAll();
    void addProgramingLanguage(ProgramingLanguage programingLanguage);
    void deleteProgramingLanguage(int id);
    void updateProgramingLanguage(ProgramingLanguage programingLanguage);

    ProgramingLanguage getById(int id);


}
