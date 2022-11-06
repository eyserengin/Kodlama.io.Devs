package com.example.Kodlama.io.Devs.business.concretes;

import com.example.Kodlama.io.Devs.business.abstracts.PLService;
import com.example.Kodlama.io.Devs.business.requests.pl.CreateAllProgramingRequest;
import com.example.Kodlama.io.Devs.business.requests.pl.DeleteProgramingLanguageRequest;
import com.example.Kodlama.io.Devs.business.requests.pl.UpdateProgramingLanguagesRequest;
import com.example.Kodlama.io.Devs.business.responses.GetAllProgramingsResponse;
import com.example.Kodlama.io.Devs.dataAccess.abtracts.PLRepository;
import com.example.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PLManager implements PLService {

    private PLRepository plRepository;

    @Autowired
    public PLManager(PLRepository plRepository) {
        this.plRepository = plRepository;
    }


    @Override
    public List<GetAllProgramingsResponse> getAll() {
        List<ProgramingLanguage> programingLanguages = plRepository.findAll();
        List<GetAllProgramingsResponse> getAllProgramingsResponses = new ArrayList<GetAllProgramingsResponse>();

        for (ProgramingLanguage pl : programingLanguages) {
            GetAllProgramingsResponse responseItem = new GetAllProgramingsResponse();
            responseItem.setId(pl.getId());
            responseItem.setName(pl.getName());
            getAllProgramingsResponses.add(responseItem);
        }
        return getAllProgramingsResponses;
    }

    @Override
    public void addProgramingLanguage(CreateAllProgramingRequest createAllProgramingRequest) throws Exception {

        ProgramingLanguage language = new ProgramingLanguage();
        language.setName(createAllProgramingRequest.getName());
        this.plRepository.save(language);
    }

    @Override
    public void deleteProgramingLanguage(DeleteProgramingLanguageRequest deleteProgramingLanguageRequest) throws Exception {
        plRepository.deleteById(deleteProgramingLanguageRequest.getId());
    }

    @Override
    public void updateProgramingLanguage(UpdateProgramingLanguagesRequest updateProgramingLanguagesRequest, Integer id) throws Exception {

        if (!updateProgramingLanguagesRequest.getName().isEmpty()) {
            ProgramingLanguage updatedProgLanguage = plRepository.findById(id).get();
            updatedProgLanguage.setName(updateProgramingLanguagesRequest.getName());
            plRepository.save(updatedProgLanguage);
        }
    }
}






