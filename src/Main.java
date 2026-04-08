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

		grays.setLaunching(true);

		grays.setSeasons(22);
		grays.setTitle("Gray's Anatomy");
		grays.setReleaseYear(2005);
		grays.setRating(7);

		System.out.println(grays.getDescription());

	}
}