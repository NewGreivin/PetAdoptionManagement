/**
 * @author Greivin
 */
package Pets;

public class Dog extends Pet{
    private int trainingLevel;

    public int getTrainingLevel() {
        return trainingLevel;
    }

    public void setTrainingLevel(int trainingLevel) {
        this.trainingLevel = trainingLevel;
    }

    public Dog(int id, String name, int age, StatePets state ,int trainingLevel) {
        super(id, name, age, state);
        this.trainingLevel = trainingLevel;
    }

    @Override
    public String toString() {
        return "Dog: " + super.toString() + "trainingLevel: " + trainingLevel;
    }
}
