package com.example.appcontactsalon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.appcontactsalon.fragment.AddSalonFragment;
import com.example.appcontactsalon.fragment.IOnSelectedSalon;
import com.example.appcontactsalon.fragment.InscriptionFragment;
import com.example.appcontactsalon.fragment.SalonFragment;
import com.example.appcontactsalon.fragment.StudentFragment;
import com.example.appcontactsalon.model.Salon;

public class MainActivity extends AppCompatActivity implements  IOnSelectedSalon {

    private SalonFragment salonFragment;
    private StudentFragment studentFragment;
    private AddSalonFragment addSalonFragment;
    private InscriptionFragment inscriptionFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salonFragment = new SalonFragment();
        studentFragment = new StudentFragment();
        addSalonFragment = new AddSalonFragment();
        inscriptionFragment = new InscriptionFragment();

        addSalonFragment.setListenerSalon(this);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.frameLayout, salonFragment)
                .add(R.id.frameLayout, studentFragment)
                .add(R.id.frameLayout, addSalonFragment)
                .add(R.id.frameLayout, inscriptionFragment)
                .hide(studentFragment)
                .hide(addSalonFragment)
                .hide(inscriptionFragment)
                .show(salonFragment)
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.menuItemAddSalon){
            getSupportFragmentManager().beginTransaction()
                    .hide(salonFragment)
                    .hide(studentFragment)
                    .hide(inscriptionFragment)
                    .show(addSalonFragment)
                    .commit();
        }
        else if(item.getItemId()==R.id.menuItemListSalon){
            getSupportFragmentManager().beginTransaction()
                    .hide(studentFragment)
                    .hide(addSalonFragment)
                    .hide(inscriptionFragment)
                    .show(salonFragment)
                    .commit();
        }
        else if (item.getItemId()==R.id.menuItemAddStudent){
            getSupportFragmentManager().beginTransaction()
                    .hide(studentFragment)
                    .hide(addSalonFragment)
                    .hide(salonFragment)
                    .show(inscriptionFragment)
                    .commit();
        }

        return super.onOptionsItemSelected(item);
    }

    public void onSelectedSalon(Salon salon){
        getSupportFragmentManager().beginTransaction()
                .hide(addSalonFragment)
                .hide(salonFragment)
                .commit();
    }

}