/**
 * @author Greivin
 */
package Pets;

public abstract class Pet {
    private int id;
    private String name;
    private int age;
    private StatePets state;

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

    public void setState(StatePets state) {
        this.state = state;
    }
    
    public Pet(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.state = StatePets.AVAILABLE;
    }

    @Override
    public String toString() {
        return "Pet: " + "id: " + id + ", name: " + name + ", age: " + age + ", state: " + state;
    }
}
