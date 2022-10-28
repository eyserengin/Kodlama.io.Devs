package com.example.Kodlama.io.Devs.webApi.controllers;

import com.example.Kodlama.io.Devs.business.abstracts.PLService;
import com.example.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/programingsLanguage")

public class ProgramingsController {

    private PLService plService;

    @Autowired
    public ProgramingsController(PLService plService) {
        this.plService = plService;
    }

    @GetMapping("/getall")
    public List<ProgramingLanguage> getAll() {

        return plService.getAll();
    }

    @GetMapping("/add")
    public void addProgramingLanguage(ProgramingLanguage programingLanguage) throws Exception {
        plService.addProgramingLanguage(programingLanguage);
    }

    @GetMapping("/delete")
    public void deleteProgramingLanguage(int id) {
        plService.deleteProgramingLanguage(id);
    }

    @GetMapping("/update")
    public void updateProgramingLanguage(ProgramingLanguage programingLanguage) {
        plService.updateProgramingLanguage(programingLanguage);
    }

    @GetMapping("/getbyid")
    public ProgramingLanguage getById(@RequestParam int id) {
        return plService.getById(id);

    }
}
