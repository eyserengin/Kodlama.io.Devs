package com.example.Kodlama.io.Devs.business.requests.st;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAllSubRequest {
    private int language_id;
    private String name;
}