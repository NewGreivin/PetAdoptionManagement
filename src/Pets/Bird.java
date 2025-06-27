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

    public Bird(int id, String name, int age, Boolean can_Fly) {
        super(id, name, age);
        this.can_Fly = can_Fly;
    }

    @Override
    public String toString() {
        return "Bird: " + "id: " + id + ", name: " + name + ", age: " + age + ", state: " + state + "Can Fly: " + can_Fly;
    }
    
    
}
