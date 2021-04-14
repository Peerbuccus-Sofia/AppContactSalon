package com.example.appcontactsalon.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;

public class Salon implements Serializable {
    private Integer id;
    private String libelle;
    private String created_up;

    public Salon(){}

    public Salon(Integer id, String libelle, String created_up) {
        this.id = id;
        this.libelle = libelle;
        this.created_up = created_up;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


    public String getCreated_up() {
        return created_up;
    }

    public void setCreated_up(String created_up) {
        this.created_up = created_up;
    }
}
