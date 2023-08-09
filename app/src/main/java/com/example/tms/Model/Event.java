package com.example.tms.Model;

public class Event {

    private String eventName;

    private String eventDesc;

    private String eventType;

    private int eventImage;

    public Event(String eventName, String eventDesc, String eventType, int eventImage) {
        this.eventName = eventName;
        this.eventDesc = eventDesc;
        this.eventType = eventType;
        this.eventImage = eventImage;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public int getEventImage() {
        return eventImage;
    }

    public void setEventImage(int eventImage) {
        this.eventImage = eventImage;
    }
}
