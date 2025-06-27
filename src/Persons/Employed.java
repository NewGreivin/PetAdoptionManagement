/**
 * @author Greivin
 */
package Persons;

public class Employed {
    private String rol;

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Employed(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Employed: " + super.toString() + ", rol: " + rol;
    }
}
