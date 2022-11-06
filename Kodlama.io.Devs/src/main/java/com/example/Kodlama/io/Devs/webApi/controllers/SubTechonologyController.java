package com.example.Kodlama.io.Devs.webApi.controllers;

import com.example.Kodlama.io.Devs.business.abstracts.STLService;
import com.example.Kodlama.io.Devs.business.requests.st.CreateAllSubRequest;
import com.example.Kodlama.io.Devs.business.requests.st.DeleteAllSubRequest;
import com.example.Kodlama.io.Devs.business.requests.st.UpdateAllSubRequest;
import com.example.Kodlama.io.Devs.business.responses.GetAllSubTechResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languagetechnology")
public class SubTechonologyController {


    private STLService stlService;

    @Autowired
    public SubTechonologyController(STLService stlService) {
        this.stlService = stlService;
    }

    @GetMapping("/getallSub")
    public List<GetAllSubTechResponse> getAll() {
        return stlService.getAll();
    }

    @PostMapping("/addSub")
    public void addSTL(CreateAllSubRequest createAllSubRequest) throws Exception {
       this.stlService.addSTL(createAllSubRequest);
    }

    @DeleteMapping("/deleteSub")
    public void deleteSTL(DeleteAllSubRequest deleteAllSubRequest) throws Exception {
        this.stlService.deleteSTL(deleteAllSubRequest);
    }

    @PutMapping("/putSub")
    public void updateSTL(UpdateAllSubRequest updateAllSubRequest, Integer id) throws Exception {
        this.stlService.updateSTL(updateAllSubRequest, id);
    }

}
