package com.screenmatch.models;

public class Serie extends Title {

    private int seasons = 1;
    private boolean launching = true;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isLaunching() {
        return launching;
    }

    public void setLaunching(boolean is_launching) {
        this.launching = is_launching;
    }

    public String getDescription() {
        int MINUTES_IN_A_HOUR = 60;
        StringBuilder description = new StringBuilder();

        description.append("Titulo:").append(getTitle()).append("\n")
                .append("Ano de Lançamento:").append(getReleaseYear()).append("\n")
                .append("Classificação: ")
                .append((getRating()/2)).append(" de 5").append(" ").append("(").append(getRatingCount()).append(")").append("\n")
                .append("Temporadas:").append(getSeasons())
        ;
        return description.toString();
    }
}
