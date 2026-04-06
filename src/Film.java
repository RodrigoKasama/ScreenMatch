public class Film {

	String title = "Filme de Exemplo";
	int release_year = 2000;
	boolean inPremium = true;
	double rating = 0;
	int ratingCount = 0;
	int runTime = 0;



	public String getDescription(){
		int MINUTES_IN_A_HOUR = 60;
		StringBuilder description = new StringBuilder();

		int runHours = this.runTime / MINUTES_IN_A_HOUR;
		int runMinutes = this.runTime % MINUTES_IN_A_HOUR;
		String formatedRuntime = "%dh e %dm".formatted(runHours, runMinutes);

		description.append("Titulo:").append(this.title).append("\n")
				.append("Ano de Lançamento:").append(this.release_year).append("\n")
				.append("Classificação: ")
					.append(Math.floor((this.rating)/2)).append(" de 5").append(" ").append("(").append(this.ratingCount).append(")\n")
				.append("Duração: ").append(formatedRuntime)
		;
		return description.toString();

	}
}