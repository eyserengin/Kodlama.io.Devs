package com.example.Kodlama.io.Devs.dataAccess.concretes;

import com.example.Kodlama.io.Devs.dataAccess.abtracts.PLRepository;
import com.example.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class InMemoryPLRepository implements PLRepository {


    List<ProgramingLanguage> PL;

    public InMemoryPLRepository() {

        PL = new ArrayList<ProgramingLanguage>();
        PL.add(new ProgramingLanguage(1,"PYTHON"));
        PL.add(new ProgramingLanguage(2,"C#"));
        PL.add(new ProgramingLanguage(3,"JAVA"));
        PL.add(new ProgramingLanguage(4,"R"));
        PL.add(new ProgramingLanguage(5,"FLUTTER"));


    }

    @Override
    public List<ProgramingLanguage> getAll() {
        return PL;
    }

    @Override
    public void addProgramingLanguage(ProgramingLanguage programingLanguage) {
        PL.add(programingLanguage);
    }

    @Override
    public void deleteProgramingLanguage(int id) {
        PL.remove(id);
    }

    @Override
    public void updateProgramingLanguage(ProgramingLanguage programingLanguage) {
        PL.get(programingLanguage.getId()).setName(programingLanguage.getName());
    }

    @Override
    public ProgramingLanguage getById(int id) {
        for (ProgramingLanguage programmingLanguage : PL) {
            if (programmingLanguage.getId()==id) {
                return programmingLanguage;}
        }

        return null;
    }
}
