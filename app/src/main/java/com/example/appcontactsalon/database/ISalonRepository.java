package com.example.appcontactsalon.database;

import com.example.appcontactsalon.model.Salon;

import java.util.ArrayList;

public interface ISalonRepository {
    public boolean add(Salon s);
    public boolean remove(Salon s);
    public ArrayList<Salon> getAll();
}
