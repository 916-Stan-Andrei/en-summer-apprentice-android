package com.example.tms;

import android.app.usage.UsageEvents;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tms.Model.Event;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Event> events = new ArrayList<>();

    int[] eventImages = {
            R.drawable.clfinal, R.drawable.f1, R.drawable.jazzinthepark, R.drawable.streetfood,
            R.drawable.untold, R.drawable.letitroll
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        RecyclerView recyclerView = findViewById(R.id.rvEventList);
        setUpEvents();

        EventAdapter adapter = new EventAdapter(events, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpEvents(){
        events.add(new Event("Champions League Final", "The 2023 UEFA Champions League final is the final match of the 2022–23 UEFA Champions League taking place in Istanbul", "VIP", eventImages[0]));
        events.add(new Event("French Grand Prix", "F1 Race", "VIP", eventImages[1]));
        events.add(new Event("Jazz in the Park", "Jazz festival", "Standard", eventImages[2]));
        events.add(new Event("Street Food Festival", "Food festival in Cluj-Napoca", "Standard", eventImages[3]));
        events.add(new Event("Untold", "Music festival", "VIP", eventImages[4]));
        events.add(new Event("Let it Roll", "DNB festival", "Standard", eventImages[5]));
    }
}
