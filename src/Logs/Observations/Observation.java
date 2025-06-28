/**
 * @author Greivin
 */
package Logs.Observations;

import Persons.Employed;
import Pets.Pet;
import java.time.LocalDate;

public class Observation {

    private LocalDate date;
    private Pet idPet;
    private String description;
    private Employed idEmployed;

    public LocalDate getDate() {
        return date;
    }
    public Pet getIdPet() {
        return idPet;
    }
    public String getDescription() {
        return description;
    }
    public Employed getIdEmployed() {
        return idEmployed;
    }

    public Observation(LocalDate date, Pet idPet, String description, Employed idEmployed) {
        this.date = date;
        this.idPet = idPet;
        this.description = description;
        this.idEmployed = idEmployed;
    }

    @Override
    public String toString() {
        return "Observation: " + "date: " + date + ", idPet: " + idPet.getId() + ", description: " + description + ", idEmployed: " + idEmployed.getId();
    }
    
    
}
