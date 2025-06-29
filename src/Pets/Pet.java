/**
 * @author Greivin
 */
package Pets;

public abstract class Pet {
    protected int id;
    protected String name;
    protected int age;
    protected StatePets state;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public StatePets getState() {
        return state;
    }

    public void setState(StatePets newState) {
        this.state = newState;
    }
    
    public Pet(int id, String name, int age, StatePets state) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.state = state;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", age: " + age + ", state: " + state;
    }
}
