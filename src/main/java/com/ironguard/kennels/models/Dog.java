package com.ironguard.kennels.models;

import java.util.List;

public class Dog {
    private String name;
    private String breed;
    private String bio;
    private List<String> images;

    public Dog(String name, String breed, String bio, List<String> images) {
        this.name = name;
        this.breed = breed;
        this.bio = bio;
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getBio() {
        return bio;
    }

    public List<String> getImages() {
        return images;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}