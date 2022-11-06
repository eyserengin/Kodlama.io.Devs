package com.example.Kodlama.io.Devs.business.abstracts;

import com.example.Kodlama.io.Devs.business.requests.pl.CreateAllProgramingRequest;
import com.example.Kodlama.io.Devs.business.requests.pl.DeleteProgramingLanguageRequest;
import com.example.Kodlama.io.Devs.business.requests.pl.UpdateProgramingLanguagesRequest;
import com.example.Kodlama.io.Devs.business.responses.GetAllProgramingsResponse;
import com.example.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;

import java.util.List;

public interface PLService {

    List<GetAllProgramingsResponse> getAll();

    void addProgramingLanguage(CreateAllProgramingRequest createAllProgramingRequest) throws Exception;
    void deleteProgramingLanguage(DeleteProgramingLanguageRequest deleteProgramingLanguageRequest) throws Exception;

    void updateProgramingLanguage(UpdateProgramingLanguagesRequest updateProgramingLanguagesRequest, Integer id) throws Exception;

}
