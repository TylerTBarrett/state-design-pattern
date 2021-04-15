/**
 * 
 * @author 2021 Tyler Barrett
 * An interface for all the states for the TV
 */

public interface State {
    /**
     * Prints the result of pressing the home button and guarantees
     * the TV will be in the HomeState
     */
    public void pressHomeButton();

    /**
     * Prints the result of pressing the Netflix button and guarantees
     * the TV will be in the NetflixState
     */
    public void pressNetflixButton();

    /**
     * Prints the result of pressing the Netflix button and guarantees the TV
     * will be in the HuluState
     */
    public void pressHuluButton();

    /**
     * Will print out all the available movies if applicable, otherwise
     * prints an error message
     */
    public void pressMovieButton();

    /**
     * Will print out all the available television shows if applicable, otherwise
     * prints an error message
     */
    public void pressTVButton();
}
