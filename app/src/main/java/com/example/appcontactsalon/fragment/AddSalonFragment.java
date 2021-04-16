package com.example.appcontactsalon.fragment;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.database.DefaultDatabaseErrorHandler;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.appcontactsalon.R;
import com.example.appcontactsalon.database.ISalonRepository;
import com.example.appcontactsalon.database.SalonRepository;
import com.example.appcontactsalon.model.Salon;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.UUID;

public class AddSalonFragment extends Fragment implements View.OnClickListener {
    EditText libelleView, dateView;
    Button buttonCancel, buttonSave;

    IOnSelectedSalon listenerSalon;

    public void setListenerSalon(IOnSelectedSalon listenerSalon) {
        this.listenerSalon = listenerSalon;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_addsalon, null);

        libelleView = (EditText)v.findViewById(R.id.editTextAddLibelle);
        dateView = (EditText) v.findViewById(R.id.editTextAddDate);
        buttonCancel = (Button) v.findViewById(R.id.button_cancel);;
        buttonSave = (Button) v.findViewById(R.id.button_addsalon);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // int id = SalonRepository.getInstance(getContext()).getIdMax();

                Salon salon = new Salon(libelleView.getText().toString(), dateView.getText().toString());
                SalonRepository.getInstance(getContext()).add(salon);
                listenerSalon.onSelectedSalon(salon);
            }
        });

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {}
        });
        return v;
    }

    @Override
    public void onClick(View v) {
    }

}
