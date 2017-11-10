package com.mets.stijn.afsprakenmets;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AppointmentAdapter extends ArrayAdapter<String>{

    public AppointmentAdapter(Context context, List appointments) { super(context, -1, appointments);}

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.appointment_list_item, null, false);

        TextView textView = itemView.findViewById(R.id.appointment_list_item_name);
        textView.setText(getItem(position));
        return textView;
    }
}
