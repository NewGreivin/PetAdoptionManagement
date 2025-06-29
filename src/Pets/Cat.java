/**
 * @author Greivin
 */
package Pets;

public class Cat extends Pet{
    private Boolean pleasure_In_Caresses;

    public Boolean getPleasure_In_Caresses() {
        return pleasure_In_Caresses;
    }

    public void setPleasure_In_Caresses(Boolean pleasure_In_Caresses) {
        this.pleasure_In_Caresses = pleasure_In_Caresses;
    }

    public Cat(int id, String name, int age, StatePets state ,Boolean pleasure_In_Caresses) {
        super(id, name, age, state);
        this.pleasure_In_Caresses = pleasure_In_Caresses;
    }


    @Override
    public String toString() {
        return "Cat: " + super.toString() + "pleasure In Caresses: " + pleasure_In_Caresses;
    }
    
    
}
