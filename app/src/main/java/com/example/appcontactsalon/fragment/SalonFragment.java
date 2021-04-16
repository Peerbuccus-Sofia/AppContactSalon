package com.example.appcontactsalon.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.appcontactsalon.R;
import com.example.appcontactsalon.database.SalonRepository;
import com.example.appcontactsalon.model.Salon;
import com.example.appcontactsalon.model.SalonAdapter;

import java.util.ArrayList;

public class SalonFragment extends Fragment implements View.OnClickListener, AdapterView.OnItemClickListener {
    ListView listViewSalons;
    TextView textViewSalon, textViewItemDate;
    ImageButton buttonDownload;
    ArrayList<Salon> salons;
    IOnSelectedSalon listener;

    public void setListener(IOnSelectedSalon listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View v) {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_salon, null);
        textViewSalon = v.findViewById(R.id.textViewItemSalon);
        textViewItemDate = v.findViewById(R.id.textViewItemDateSalon);
        buttonDownload = v.findViewById(R.id.imageButtonDownload);
        listViewSalons = v.findViewById(R.id.listViewSalons);
        listViewSalons.setOnItemClickListener(this);
        showListSalon();
        return v;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        listener.onSelectedSalon(salons.get(position));
    }

    public void showListSalon(){
        this.salons = SalonRepository.getInstance(getContext()).getAll();
        refresh();
    }

    public void refresh(){
        SalonAdapter salonAdapter = new SalonAdapter(getActivity(), salons);
        listViewSalons.setAdapter(salonAdapter);
    }



}
