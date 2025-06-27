/**
 * @author Greivin
 */
package Persons;

public abstract class Person {
    private String id;
    private String nombre;
    private String email;

    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }

    public Person(String id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person: " + "id: " + id + ", nombre: " + nombre + ", email: " + email;
    }
}
