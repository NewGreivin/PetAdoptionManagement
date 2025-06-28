/**
 * @author Greivin
 */
package Logs.Adoptions;

import Persons.Adopter;
import Persons.Employed;
import Pets.Pet;
import java.time.LocalDate;

public class Adoption {

    private LocalDate date;
    private Pet idPet;
    private Adopter idAdopter;
    private Employed idEmployed;

    public LocalDate getDate() {
        return date;
    }
    public Pet getIdPet() {
        return idPet;
    }
    public Adopter getIdAdopter() {
        return idAdopter;
    }
    public Employed getIdEmployed() {
        return idEmployed;
    }

    public Adoption(LocalDate date, Pet idPet, Adopter idAdopter, Employed idEmployed) {
        this.date = date;
        this.idPet = idPet;
        this.idAdopter = idAdopter;
        this.idEmployed = idEmployed;
    }

    @Override
    public String toString() {
        return "AdoptionLog: " + "date: " + date + ", idPet: " + idPet.getId() + ", idAdopter: " + idAdopter.getId() + ", idEmployed: " + idEmployed.getId();
    }

}
