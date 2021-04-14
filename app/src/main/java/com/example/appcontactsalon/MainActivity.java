package com.example.appcontactsalon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;

import com.example.appcontactsalon.fragment.SalonFragment;
import com.example.appcontactsalon.fragment.StudentFragment;

public class MainActivity extends AppCompatActivity {

    private SalonFragment salonFragment;
    private StudentFragment studentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salonFragment = new SalonFragment();
        studentFragment = new StudentFragment();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.frameLayout, salonFragment)
                .hide(studentFragment)
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


}