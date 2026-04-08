package com.screenmatch.models;

public abstract class Title {

    private String title = "Titulo de Exemplo";
    private int releaseYear = 2000;
    private boolean inPremium = true;
    private double rating = 0;
    private int ratingCount = 0;
    private int runTime = 0;


    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isInPremium() {
        return inPremium;
    }

    public double getRating() {
        return rating;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(int release_year) {
        this.releaseYear = release_year;
    }

    public void setInPremium(boolean inPremium) {
        this.inPremium = inPremium;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public abstract String getDescription();

}
