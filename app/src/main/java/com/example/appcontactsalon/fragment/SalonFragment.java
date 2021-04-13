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
import com.example.appcontactsalon.model.Salon;
import com.example.appcontactsalon.model.SalonAdapter;

import java.util.ArrayList;

public class SalonFragment extends Fragment implements View.OnClickListener {
    ListView salonListView;
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
        //buttonDownload.setOnClickListener(this);


        salonListView = v.findViewById(R.id.listViewSalons);
        adapter = new SalonAdapter(getActivity(), sampleSalon());
        salonListView.setAdapter(adapter);

        registerForContextMenu(salonListView);

        return v;
    }

    public ArrayList<Salon> sampleSalon(){
        ArrayList<Salon> salons = new ArrayList<>();
        salons.add(new Salon("Salon de l'alternance", "2021-04-13"));
        salons.add(new Salon("Salon de l'étudiant", "2021-05-13"));
        salons.add(new Salon("Salon de l'alternance", "2021-06-10"));
        salons.add(new Salon("Salon de l'alternance", "2021-04-13"));

        return salons;
    }


    public void setCurrrentSalon(Salon salon){
        this.currentSalon = salon;
        refresh();
    }

    private void refresh(){
        if(currentSalon!=null){
            textViewSalon.setText(currentSalon.getLibelle());
            textViewItemDate.setText((CharSequence) currentSalon.getCreated_up());
        }
    }

    @Override
    public void onClick(View v) {

    }




}
