package com.example.appcontactsalon.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.example.appcontactsalon.model.Salon;

import java.util.ArrayList;

public class SalonRepository implements ISalonRepository {

    private DatabaseManager dbm;
    private static SalonRepository instance;

    private SalonRepository(Context context){this.dbm = DatabaseManager.getInstance(context);}
    public static SalonRepository getInstance(Context context){
        if(instance==null){
            instance= new SalonRepository(context);
        }
        return instance;
    }

    @Override
    public boolean add(Salon s) {
        ContentValues values = new ContentValues();
        values.put("id", s.getId());
        values.put("libelle", s.getLibelle());
        values.put("created_up", s.getCreated_up());
        long line = dbm.getWritableDatabase().insert("salon",null, values);
        return line !=0;
    }

    @Override
    public boolean remove(Salon s) {
        String[] identifier = {String.valueOf(s.getId())};
        long line= dbm.getWritableDatabase().delete("salon", "id=?", identifier);
        return line != 0;
    }

    @Override
    public ArrayList<Salon> getAll() {
        ArrayList<Salon> salons = new ArrayList<>();
        Cursor c = dbm.getReadableDatabase().rawQuery("select * from salon", null);
        c.moveToFirst();
        while(!c.isAfterLast()){
            Salon s = new Salon();
            s.setId(c.getInt(0));
            s.setLibelle(c.getString(1));
            s.setCreated_up(c.getString(2));
            salons.add(s);
            c.moveToNext();
        }
        c.close();
        return salons;

    }
}
