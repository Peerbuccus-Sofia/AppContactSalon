package com.example.appcontactsalon.fragment;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.appcontactsalon.R;
import com.example.appcontactsalon.database.SalonRepository;
import com.example.appcontactsalon.model.Salon;
import com.example.appcontactsalon.model.SalonAdapter;

import java.util.ArrayList;

public class SalonFragment extends Fragment implements View.OnClickListener {
    ListView listViewSalons;
    TextView textViewSalon, textViewItemDate;
    ImageButton buttonDownload;
    Salon currentSalon;
    SalonAdapter adapter;
    ArrayList<Salon> salons;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_salon, null);

        textViewSalon = v.findViewById(R.id.textViewSalon);
        textViewItemDate = v.findViewById(R.id.textViewItemDateSalon);
        buttonDownload = v.findViewById(R.id.imageButtonDownload);
        buttonDownload.setOnClickListener(this);

        if(listViewSalons == null){
            listViewSalons = v.findViewById(R.id.listViewSalons);
            adapter = new SalonAdapter(getActivity(), sampleSalon());
            listViewSalons.setAdapter(adapter);
            registerForContextMenu(listViewSalons);
        } else {
            showListSalon();
        }
        return v;
    }

    public ArrayList<Salon> sampleSalon(){
        ArrayList<Salon> salons = new ArrayList<>();
        salons.add(new Salon(1,"Salon de l'alternance", "2021-04-13"));
        salons.add(new Salon(2,"Salon de l'étudiant", "2021-05-13"));
        salons.add(new Salon(3,"Salon de l'alternance", "2021-06-10"));
        salons.add(new Salon(4,"Salon de l'alternance", "2021-04-13"));

        return salons;
    }


    public void setCurrrentSalon(Salon salon){
        this.currentSalon = salon;
        refresh();
    }

    public void showListSalon(){
        this.salons = SalonRepository.getInstance(getContext()).getAll();
        refresh();
    }

    public void refresh(){
        SalonAdapter salonAdapter = new SalonAdapter(getActivity(), salons);
        listViewSalons.setAdapter(salonAdapter);
    }

    @Override
    public void onClick(View v) {

    }




}
