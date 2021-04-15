/**
 * 
 * @author 2021 Tyler Barrett
 * A virtual representation of a TV
 */
public class TV {
    private State HomeState;
    private State NetflixState;
    private State HuluState;
    private State state;

    public TV() {
        HomeState = new HomeState(this);
        NetflixState = new NetflixState(this);
        HuluState = new HuluState(this);
        state = HomeState;
    }

    public void pressHomeButton() {

    }

    public void pressNetflixButton() {

    }

    public void pressHuluButton() {

    }

    public void pressMovieButton() {

    }

    public void pressTVButton() {

    }

    public void setState(State state) {

    }

    public State getHomeState() {
        return this.HomeState;
    }

    public State getNetflixState() {
        return this.NetflixState;
    }

    public State getHuluState() {
        return this.HuluState;
    }
}


