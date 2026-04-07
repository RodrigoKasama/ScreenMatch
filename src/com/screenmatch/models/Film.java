package com.screenmatch.models;

public class Film {

	private String title = "Filme de Exemplo";
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


	public String getDescription(){
		int MINUTES_IN_A_HOUR = 60;
		StringBuilder description = new StringBuilder();

		int runHours = getRunTime() / MINUTES_IN_A_HOUR;
		int runMinutes = getRunTime() % MINUTES_IN_A_HOUR;
		String formatedRuntime = "%dh e %dm".formatted(runHours, runMinutes);

		description.append("Titulo:").append(getTitle()).append("\n")
				.append("Ano de Lançamento:").append(getReleaseYear()).append("\n")
				.append("Classificação: ")
					.append(Math.floor((getRating())/2)).append(" de 5").append(" ").append("(").append(getRatingCount()).append(")\n")
				.append("Duração: ").append(formatedRuntime)
		;
		return description.toString();

	}
}