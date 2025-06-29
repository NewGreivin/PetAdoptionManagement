/**
 * @author Greivin
 */
package Persons;

public class Adopter extends Person {
    private String phone;
    private String type_of_housing;

    public String getPhone() {
        return phone;
    }
    public String getType_of_housing() {
        return type_of_housing;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setType_of_housing(String type_of_housing) {
        this.type_of_housing = type_of_housing;
    }

    public Adopter(String id, String nombre, String email, String phone, String type_of_housing) {
        super(id, nombre, email);
        this.phone = phone;
        this.type_of_housing = type_of_housing;
    }

    @Override
    public String toString() {
        return "Adopter: " + super.toString() + "phone: " + phone + ", type_of_housing: " + type_of_housing;
    }
    
}
