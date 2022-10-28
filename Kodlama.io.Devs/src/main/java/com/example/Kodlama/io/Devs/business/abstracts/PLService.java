package com.example.Kodlama.io.Devs.business.abstracts;

import com.example.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;

import java.util.List;

public interface PLService {

    List<ProgramingLanguage> getAll();
    void addProgramingLanguage(ProgramingLanguage programingLanguage) throws Exception;
    void deleteProgramingLanguage(int id);
    void updateProgramingLanguage(ProgramingLanguage programingLanguage);

    ProgramingLanguage getById(int id);
}
