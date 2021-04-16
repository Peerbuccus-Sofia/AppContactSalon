package com.example.appcontactsalon.model;

import android.widget.ArrayAdapter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class SalonHelper {

    public static String dataToJson(ArrayList<Salon> salons){
        List<Salon> salonList = new ArrayList<>(salons.size());
        for(Salon s: salons){
            salonList.add(s);
        }
        Gson gson = new Gson();
        String jsonString = gson.toJson(salonList);
        return jsonString;
    }

    public static ArrayList<Salon> jsonToData(String json){
        Gson gson = new Gson();
        Type typeMyType = new TypeToken<ArrayList<Salon>>(){}.getType();
        ArrayList<Salon> salons = gson.fromJson(json, typeMyType);
        return salons;
    }

}
