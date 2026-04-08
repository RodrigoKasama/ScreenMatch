import com.screenmatch.calculos.CalculatorMarathon;
import com.screenmatch.models.Film;
import com.screenmatch.models.Serie;

public class Main {

	public static void main(String[] args) {
		Film interstellar = new Film();
		interstellar.setTitle("Interestelar");
		interstellar.setReleaseYear(2014);
		interstellar.setRating(8);
		interstellar.setRatingCount(1);
		interstellar.setRunTime(169);
		interstellar.setDirector("Christofer Nolan");

		String interstellarDescription = interstellar.getDescription();

		System.out.println(interstellarDescription+"\n");

		Serie grays = new Serie();
		grays.setTitle("Gray's Anatomy");
		grays.setReleaseYear(2005);
		grays.setLaunching(true);
		grays.setRating(7);

		grays.setSeasons(20);
		grays.setEpisodesBySeason(10);
		grays.setMeanMinutesByEpisode(30);

		System.out.println(grays.getDescription());

		CalculatorMarathon marathon = new CalculatorMarathon();
		marathon.include(interstellar);
		marathon.include(grays);

		System.out.println("Duração da maratona:" + marathon.getDuration());

	}
}