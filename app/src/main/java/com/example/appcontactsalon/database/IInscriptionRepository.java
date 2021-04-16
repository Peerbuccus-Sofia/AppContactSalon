package com.example.appcontactsalon.database;

import com.example.appcontactsalon.model.Inscription;

import java.util.ArrayList;


public interface IInscriptionRepository {
    public boolean add(Inscription i);
    public boolean remove(Inscription i);
    public ArrayList<Inscription> getAll();
}