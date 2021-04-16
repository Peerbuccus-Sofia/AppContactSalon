package com.example.appcontactsalon.model;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

import com.example.appcontactsalon.R;
import com.example.appcontactsalon.fragment.SalonFragment;

import java.util.ArrayList;

public class SalonAdapter extends BaseAdapter {

    private Activity activity;
    private ArrayList<Salon> salons;

    public SalonAdapter(FragmentActivity activity, ArrayList<Salon> salons) {
        this.activity = activity;
        this.salons = salons;
    }

    @Override
    public int getCount() {
        return salons.size();
    }

    @Override
    public Object getItem(int position) {
        return salons.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView = LayoutInflater.from(activity).inflate(R.layout.item_salon, parent, false);
        }
        TextView textViewSalon = convertView.findViewById(R.id.textViewItemSalon);
        textViewSalon.setText(salons.get(position).getLibelle());
        TextView textViewItemDateSalon = convertView.findViewById(R.id.textViewItemDateSalon);
        textViewItemDateSalon.setText((CharSequence) salons.get(position).getCreated_up());

        ImageButton imageButtonDownload = convertView.findViewById((R.id.imageButtonDownload));

        return convertView;
    }
}
