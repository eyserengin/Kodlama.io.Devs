package com.example.Kodlama.io.Devs.business.concretes;

import com.example.Kodlama.io.Devs.business.abstracts.PLService;
import com.example.Kodlama.io.Devs.dataAccess.abtracts.PLRepository;
import com.example.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PLManager implements PLService {

    PLRepository plRepository;

    @Autowired
    public PLManager(PLRepository plRepository) {
        this.plRepository = plRepository;
    }


    @Override
    public List<ProgramingLanguage> getAll() {
        return plRepository.getAll();
    }

    @Override
    public void addProgramingLanguage(ProgramingLanguage programingLanguage) throws Exception {
        if (programingLanguage.getName() != null) {
            for (ProgramingLanguage language : plRepository.getAll()) {
                if (language.getName().equalsIgnoreCase(programingLanguage.getName())) {
                    throw new Exception("Aynı isimli programlama dili tekrar edemez");
                }
            }
        } else {
            throw new Exception("Bu alan boş geçilemez");
        }
    }

    @Override
    public void deleteProgramingLanguage(int id) {
        plRepository.deleteProgramingLanguage(id);
    }

    @Override
    public void updateProgramingLanguage(ProgramingLanguage programingLanguage) {
        plRepository.updateProgramingLanguage(programingLanguage);
    }

    @Override
    public ProgramingLanguage getById(int id) {
        return plRepository.getById(id);
    }


}
