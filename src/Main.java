import com.screenmatch.models.Film;

public class Main {

	public static void main(String[] args) {
		Film interstellar = new Film();
		interstellar.setTitle("Interestelar");
		interstellar.setReleaseYear(2014);
		interstellar.setReleaseYear(8);
		interstellar.setRatingCount(1);
		interstellar.setRunTime(169);

		String interstellarDescription = interstellar.getDescription();

		System.out.println(interstellarDescription);

	}
}