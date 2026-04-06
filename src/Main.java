public class Main {

	public static void main(String[] args) {
		Film interstellar = new Film();
		interstellar.title = "Interestelar";
		interstellar.release_year = 2014;
		interstellar.rating = 8;
		interstellar.ratingCount= 1;
		interstellar.runTime = 169;

		String interstellarDescription = interstellar.getDescription();

		System.out.println(interstellarDescription);

	}
}