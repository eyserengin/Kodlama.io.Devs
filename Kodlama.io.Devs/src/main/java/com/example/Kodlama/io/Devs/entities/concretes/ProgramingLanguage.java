package com.example.Kodlama.io.Devs.entities.concretes;

public class ProgramingLanguage {
    int id;
    String name;

    public ProgramingLanguage(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProgramingLanguage() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
