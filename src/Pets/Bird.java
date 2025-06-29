/**
 * @author Greivin
 */
package Pets;

public class Bird extends Pet {
    private Boolean can_Fly;

    public Boolean getCan_Fly() {
        return can_Fly;
    }

    public void setCan_Fly(Boolean can_Fly) {
        this.can_Fly = can_Fly;
    }

    public Bird(int id, String name, int age, StatePets state ,Boolean can_Fly) {
        super(id, name, age,state);
        this.can_Fly = can_Fly;
    }

    @Override
    public String toString() {
        return "Bird: " + super.toString() + "Can Fly: " + can_Fly;
    }
}
