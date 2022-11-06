package com.example.Kodlama.io.Devs.business.abstracts;



import com.example.Kodlama.io.Devs.business.requests.st.CreateAllSubRequest;
import com.example.Kodlama.io.Devs.business.requests.st.DeleteAllSubRequest;
import com.example.Kodlama.io.Devs.business.requests.st.UpdateAllSubRequest;
import com.example.Kodlama.io.Devs.business.responses.GetAllSubTechResponse;
import com.example.Kodlama.io.Devs.entities.concretes.SubTechnologyLanguage;

import java.util.List;

public interface STLService {

    List<GetAllSubTechResponse> getAll();

    void addSTL(CreateAllSubRequest createAllSubRequest) throws Exception;
    void deleteSTL(DeleteAllSubRequest deleteAllSubRequest) throws Exception;
    void updateSTL(UpdateAllSubRequest updateAllSubRequest, Integer id) throws Exception;
}
