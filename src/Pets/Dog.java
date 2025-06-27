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

    public Dog(int id, String name, int age, int trainingLevel) {
        super(id, name, age);
        this.trainingLevel = trainingLevel;
    }

    @Override
    public String toString() {
        return "Dog: " + "id: " + id + ", name: " + name + ", age: " + age + ", state: " + state + "trainingLevel: " + trainingLevel;
    }
}
