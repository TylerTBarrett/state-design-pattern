/**
 * 
 * @author 2021 Tyler Barrett
 * Object denoting the state HomeState
 */

public class HomeState implements State {
    private TV tv;

    public HomeState(TV tv) {
        this.tv = tv;
    }

    public void pressHomeButton() {
        System.out.println("TV is already on the home screen\n");
    }

    public void pressNetflixButton() {
        System.out.println("Loading Netflix...\n");
        tv.setState(tv.getNetflixState());
    }

    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        tv.setState(tv.getHuluState());
    }

    public void pressMovieButton() {
        System.out.println("You must choose an app to show movies\n");
    }

    public void pressTVButton() {
        System.out.println("You must choose an app to show tv shows\n");
    }
}
