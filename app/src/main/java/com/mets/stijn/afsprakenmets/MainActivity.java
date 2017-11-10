package com.mets.stijn.afsprakenmets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<Appointment> appointment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppointmentDummyRepository appointments = new AppointmentDummyRepository();
        List<Appointment> appointment = appointments.getAppointments();

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(new AppointmentAdapter(this, appointment));


    }
}
