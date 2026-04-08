package com.screenmatch.models;

public class Serie extends Title {

    private int seasons = 1;
    private boolean launching = true;
    private int meanMinutesByEpisode = 1;
    private int episodesBySeason = 1;

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

    @Override
    public int getRunTime(){
        return this.meanMinutesByEpisode * this.episodesBySeason * this.seasons;
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

    public int getMeanMinutesByEpisode() {
        return meanMinutesByEpisode;
    }

    public void setMeanMinutesByEpisode(int meanMinutesByEpisode) {
        this.meanMinutesByEpisode = meanMinutesByEpisode;
    }

    public int getEpisodesBySeason() {
        return episodesBySeason;
    }

    public void setEpisodesBySeason(int episodesBySeason) {
        this.episodesBySeason = episodesBySeason;
    }
}
