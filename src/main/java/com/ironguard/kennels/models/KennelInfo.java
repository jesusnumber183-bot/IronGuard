package com.ironguard.kennels.models;

public class KennelInfo {
    private String history;
    private String mission;
    private String contact;

    public KennelInfo(String history, String mission, String contact) {
        this.history = history;
        this.mission = mission;
        this.contact = contact;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}