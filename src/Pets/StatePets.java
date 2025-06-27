/**
 * @author Greivin
 */
package Pets;

public enum StatePets {
    AVAILABLE("Available"),
    ADOPTED("Adopted"),
    OBSERVATION("Observation");
    
    private final String state;

    public String getState() {
        return state;
    }

    private StatePets(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "StatePets: " + " state: " + state;
    }
}
