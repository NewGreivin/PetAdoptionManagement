/**
 * @author Greivin
 */
package Persons;

public class Employed  extends Person {
    private String rol;

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Employed(String id, String nombre, String email, String rol) {
        super(id, nombre, email);
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Employed: " + super.toString() + ", rol: " + rol;
    }
}
