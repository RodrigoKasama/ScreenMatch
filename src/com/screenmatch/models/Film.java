package com.screenmatch.models;

public class Film extends Title {

    private String director = "";

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescription() {
        int MINUTES_IN_A_HOUR = 60;
        StringBuilder description = new StringBuilder();

        int runHours = getRunTime() / MINUTES_IN_A_HOUR;
        int runMinutes = getRunTime() % MINUTES_IN_A_HOUR;
        String formatedRuntime = "%dh e %dm".formatted(runHours, runMinutes);

        description.append("Titulo:").append(getTitle()).append("\n")
                .append("Ano de Lançamento:").append(getReleaseYear()).append("\n")
                .append("Classificação: ")
                .append(Math.floor((getRating()) / 2)).append(" de 5").append(" ").append("(").append(getRatingCount()).append(")").append("\n")
                .append("Duração: ").append(formatedRuntime).append(".\n")
                .append("Direção:").append(getDirector())
        ;
        return description.toString();
    }
}