/**
 * @author Greivin
 */
package PetCore;

import Logs.Adoptions.Adoption;
import Persons.Adopter;
import Persons.Employed;
import Pets.Bird;
import Pets.Cat;
import Pets.Dog;
import Pets.Pet;
import Pets.StatePets;
import Shelters.Shelter;
import java.time.LocalDate;

public class Core {

    public static void main(String[] args) {
        Shelter e1 = new Shelter(1,"Liberia Centro",3);
        
        Pet p1 = new Cat(1, "Luna", 3, StatePets.AVAILABLE, true);
        Pet p2 = new Bird(2, "Max", 5, StatePets.ADOPTED, true );
        Pet p3 = new Dog(3, "Nina", 2, StatePets.AVAILABLE , 4);
        
        e1.addPet(p1);
        e1.addPet(p2);
        e1.addPet(p3);
        System.out.println(e1);
        
        Adopter a1 = new Adopter("504600213", "Greivin", "Greivin@gmail.com", "8729-2564", "Grande");
        Employed  a2 = new Employed("504210543", "Javier", "Javier@gmail.com", "Veterinario");
        
        p1.setState(StatePets.ADOPTED);
        Adoption f1 = new Adoption(LocalDate.now(), p1, a1, a2);
        
        System.out.println(e1);
        System.out.println(f1);
    }   
}
