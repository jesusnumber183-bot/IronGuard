package com.ironguard.kennels.models;

public class Litter {
    private String expectedDate;
    private String sire;
    private String dam;
    private String notes;

    public Litter(String expectedDate, String sire, String dam, String notes) {
        this.expectedDate = expectedDate;
        this.sire = sire;
        this.dam = dam;
        this.notes = notes;
    }

    public String getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(String expectedDate) {
        this.expectedDate = expectedDate;
    }

    public String getSire() {
        return sire;
    }

    public void setSire(String sire) {
        this.sire = sire;
    }

    public String getDam() {
        return dam;
    }

    public void setDam(String dam) {
        this.dam = dam;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}