/**
 * 
 * @author 2021 Tyler Barrett
 * Class denoting the HuluState and the functionality for that state
 */

public class HuluState implements State {
    private TV tv;
    private static final String[] MOVIES = {"Girl", "Run", "WeWork: Or the Making and Breaking of a $47 Billion Unicorn", "Boss Level", "NomadLand"};
    private static final String[] SHOWS = {"Big Sky", "Prodigal Son", "The Handmaid's Tale", "Snowfall", "Good Trouble"};

    public HuluState(TV tv) {
        this.tv = tv;
    }

    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...\n");
        tv.setState(tv.getHomeState());
    }

    public void pressNetflixButton() {
        System.out.println("Loading Netflix...\n");
        tv.setState(tv.getNetflixState());
    }

    public void pressHuluButton() {
        System.out.println("We are already in Hulu\n");
    }

    public void pressMovieButton() {
        System.out.println("Hulu Movies:");
        for (int i = 0; i < MOVIES.length; i++) {
            System.out.println("- " + MOVIES[i]);
        }
        System.out.println();
    }

    public void pressTVButton() {
        System.out.println("Hulu TV Shows:");
        for (int i = 0; i < SHOWS.length; i++) {
            System.out.println("- " + SHOWS[i]);
        }
        System.out.println();
    }
}
