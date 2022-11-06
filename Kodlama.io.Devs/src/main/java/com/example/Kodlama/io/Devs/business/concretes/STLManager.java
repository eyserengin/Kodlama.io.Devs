package com.example.Kodlama.io.Devs.business.concretes;

import com.example.Kodlama.io.Devs.business.abstracts.PLService;
import com.example.Kodlama.io.Devs.business.abstracts.STLService;
import com.example.Kodlama.io.Devs.business.requests.pl.UpdateProgramingLanguagesRequest;
import com.example.Kodlama.io.Devs.business.requests.st.CreateAllSubRequest;
import com.example.Kodlama.io.Devs.business.requests.st.DeleteAllSubRequest;
import com.example.Kodlama.io.Devs.business.requests.st.UpdateAllSubRequest;
import com.example.Kodlama.io.Devs.business.responses.GetAllProgramingsResponse;
import com.example.Kodlama.io.Devs.business.responses.GetAllSubTechResponse;
import com.example.Kodlama.io.Devs.dataAccess.abtracts.PLRepository;
import com.example.Kodlama.io.Devs.dataAccess.abtracts.STLRepository;
import com.example.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;
import com.example.Kodlama.io.Devs.entities.concretes.SubTechnologyLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class STLManager implements STLService {


    private STLRepository stlRepository;
    private PLRepository plRepository;


    @Autowired
    public STLManager(STLRepository stlRepository,PLRepository plRepository) {
        this.stlRepository = stlRepository;
        this.plRepository = plRepository;
    }


    @Override
    public List<GetAllSubTechResponse> getAll() {
        List<SubTechnologyLanguage> stl = stlRepository.findAll();
        List<GetAllSubTechResponse> responses = new ArrayList<>();

        for (SubTechnologyLanguage subTechnologyLanguage : stl){
            GetAllSubTechResponse respondItem = new GetAllSubTechResponse();
            respondItem.setName(subTechnologyLanguage.getName());
            respondItem.setLanguageName(subTechnologyLanguage.getProgramingLanguage().getName());
            responses.add(respondItem);

        }
        return responses;
    }

    @Override
    public void addSTL(CreateAllSubRequest createAllSubRequest) throws Exception {
        SubTechnologyLanguage subTechnologyLanguage = new SubTechnologyLanguage();
        ProgramingLanguage programingLanguage = plRepository.findById(createAllSubRequest.getLanguage_id()).get();

        subTechnologyLanguage.setName(createAllSubRequest.getName());
        subTechnologyLanguage.setProgramingLanguage(programingLanguage);
        stlRepository.save(subTechnologyLanguage);

    }

    @Override
    public void deleteSTL(DeleteAllSubRequest deleteAllSubRequest) throws Exception {
        stlRepository.deleteById(deleteAllSubRequest.getId());

    }

    @Override
    public void updateSTL(UpdateAllSubRequest updateAllSubRequest, Integer id) throws Exception {
       SubTechnologyLanguage subTechnologyLanguage = stlRepository.findById(id).get();
       ProgramingLanguage programingLanguage = plRepository.findById(updateAllSubRequest.getLanguage_id()).get();
       subTechnologyLanguage.setName(updateAllSubRequest.getName());
       subTechnologyLanguage.setProgramingLanguage(programingLanguage);
       stlRepository.save(subTechnologyLanguage);
    }

}
