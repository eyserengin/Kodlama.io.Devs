package com.example.Kodlama.io.Devs.business.requests.st;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAllSubRequest {
    private String name;
    private int language_id;
}
