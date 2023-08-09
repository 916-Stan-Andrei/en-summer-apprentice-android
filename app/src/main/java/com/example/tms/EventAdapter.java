package com.example.tms;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tms.Model.Event;

import java.util.ArrayList;


public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder> {

    ArrayList<Event> events;
    Context context;

    public EventAdapter(ArrayList<Event> events, Context context) {
        this.events = events;
        this.context = context;
    }

    public static class EventViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView titleView;
        TextView descView;
        TextView typeView;

        public EventViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            titleView = itemView.findViewById(R.id.title);
            descView = itemView.findViewById(R.id.description);
            typeView = itemView.findViewById(R.id.ticketType);
        }
    }


    @NonNull
    @Override
    public EventAdapter.EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.event_design, parent, false);
        return new EventAdapter.EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventAdapter.EventViewHolder holder, int position) {
        holder.imageView.setImageResource(events.get(position).getEventImage());
        holder.titleView.setText(events.get(position).getEventName());
        holder.descView.setText(events.get(position).getEventDesc());
        holder.typeView.setText(events.get(position).getEventType());
    }

    @Override
    public int getItemCount() {
        return events.size();
    }
}
