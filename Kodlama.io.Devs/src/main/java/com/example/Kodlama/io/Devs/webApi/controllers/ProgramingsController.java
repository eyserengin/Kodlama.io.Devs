package com.example.Kodlama.io.Devs.webApi.controllers;

import com.example.Kodlama.io.Devs.business.abstracts.PLService;
import com.example.Kodlama.io.Devs.business.requests.pl.CreateAllProgramingRequest;
import com.example.Kodlama.io.Devs.business.requests.pl.DeleteProgramingLanguageRequest;
import com.example.Kodlama.io.Devs.business.requests.pl.UpdateProgramingLanguagesRequest;
import com.example.Kodlama.io.Devs.business.responses.GetAllProgramingsResponse;
import com.example.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programingsLanguages")

public class ProgramingsController {
    private PLService plService;

    @Autowired
    public ProgramingsController(PLService plService) {
        this.plService = plService;
    }


    @GetMapping("/getallPL")
    public List<GetAllProgramingsResponse> getAll() {
        return plService.getAll();
    }

    @PostMapping("/addPL")
    public void addProgramingLanguage(CreateAllProgramingRequest createAllProgramingRequest) throws Exception {
        this.plService.addProgramingLanguage(createAllProgramingRequest);
    }

    @DeleteMapping("/deletePL")
    public void deleteProgramingLanguage(DeleteProgramingLanguageRequest deleteProgramingLanguageRequest) throws Exception {
        this.plService.deleteProgramingLanguage(deleteProgramingLanguageRequest);
    }

    @PutMapping("/putPL")
    public void updateProgramingLanguage(UpdateProgramingLanguagesRequest updateProgramingLanguagesRequest, Integer id) throws Exception {
        this.plService.updateProgramingLanguage(updateProgramingLanguagesRequest, id);
    }

}
