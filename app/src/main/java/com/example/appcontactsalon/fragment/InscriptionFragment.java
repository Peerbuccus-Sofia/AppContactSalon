package com.example.appcontactsalon.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.appcontactsalon.R;

public class InscriptionFragment extends Fragment implements View.OnClickListener {
    EditText firstName, lastName, birthDate, adress, city, postalCode, phone, mobilePhone, email, lastDiploma;
    Spinner chosenCourse;
    RadioButton coursetypeinitial, coursetypealternance;
    Button buttonCancel, buttonSave, buttonDelete;
    Integer id;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_inscription, null);
        firstName = v.findViewById(R.id.editTextFirstName);
        lastName = v.findViewById(R.id.editTextLastName);
        birthDate = v.findViewById(R.id.editTextBirthDate);
        adress = v.findViewById(R.id.editTextAdress);
        city = v.findViewById(R.id.editTextCity);
        postalCode = v.findViewById(R.id.editTextPostalCode);
        phone = v.findViewById(R.id.editTextPhone);
        mobilePhone = v.findViewById(R.id.editTextMobilePhone);
        email = v.findViewById(R.id.editTextEmail);
        lastDiploma = v.findViewById(R.id.editTextLastDiploma);
        chosenCourse = (Spinner) v.findViewById(R.id.spinnerChosenCourse);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.field_chosencourse, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        chosenCourse.setAdapter(adapter);
        coursetypeinitial = v.findViewById(R.id.radioButtonInitial);
        coursetypeinitial.setOnClickListener(this);

        coursetypealternance = v.findViewById(R.id.radioButtonAlternance);
        coursetypealternance.setOnClickListener(this);

        buttonCancel = v.findViewById(R.id.button_cancel);
        buttonCancel.setOnClickListener(this);
        buttonSave = v.findViewById(R.id.button_save);
        buttonSave.setOnClickListener(this);
        buttonDelete = v.findViewById(R.id.button_delete);
        buttonDelete.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view) {
        Button button = (Button) view;
        if (button.equals(buttonSave)){

        }else if (button.equals(buttonCancel)){

        }else if (button.equals(buttonDelete)){

        }
    }
}
