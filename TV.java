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

    /**
     * Constructs the TV setting the current state to the home state
     */
    public TV() {
        HomeState = new HomeState(this);
        NetflixState = new NetflixState(this);
        HuluState = new HuluState(this);
        state = HomeState;
    }

    /**
     * Will call the method for pressing the home button depending on what state the 
     * TV is in
     */
    public void pressHomeButton() {
        state.pressHomeButton();
    }

    /**
     * Calls the method for pressing the netflix button depending
     * on what state the TV is in
     */
    public void pressNetflixButton() {
        state.pressNetflixButton();
    }

    /**
     * Calls the method for pressing the hulu button
     * depending on what state the TV is in
     */
    public void pressHuluButton() {
        state.pressHuluButton();
    }

    /**
     * Calls the method for pressing the Movie button
     * depending on what state the TV is in
     */
    public void pressMovieButton() {
        state.pressMovieButton();
    }

    /**
     * Calls the method for pressing the 
     * TV button depending on what state the TV is in
     */
    public void pressTVButton() {
        state.pressTVButton();
    }

    /**
     * Sets the state of the TV to the incoming param
     * @param state used to determine the state the TV will be set to
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Returns the instance of the HomeState of the TV
     * @return HomeState for this TV object
     */
    public State getHomeState() {
        return this.HomeState;
    }

    /**
     * Returns the instance fo the NetflixState of the TV
     * @return NetflixState for this TV object
     */
    public State getNetflixState() {
        return this.NetflixState;
    }

    /**
     * Returns the instance of the HuluState of the TV
     * @return HuluState for this TV object
     */
    public State getHuluState() {
        return this.HuluState;
    }
}


