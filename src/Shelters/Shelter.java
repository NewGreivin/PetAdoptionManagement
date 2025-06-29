/**
 * @author Greivin
 */
package Shelters;

import Pets.Pet;
import Pets.StatePets;

public class Shelter {
    private int id; 
    private String locate; 
    private int maxCapacity; 
    private Pet[] petList;

    public int getId() {
        return id;
    }
    public String getLocate() {
        return locate;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }
    public Pet[] getPetList() {
        return petList;
    }
    

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean addPet(Pet pet){
        int max = petList.length;
        for (int i = 0; i < max; i++) {
            if (petList[i] == null) {
            if (max < maxCapacity){
                petList[i] = pet;
                return true;
            }
            }
        }
        return false;
    }
    
    public Shelter(int id, String locate, int maxCapacity, String[] PetList) {
        this.id = id;
        this.locate = locate;
        this.maxCapacity = maxCapacity;
        this.petList = new Pet[maxCapacity];
    }

    public int getPetCount() {
        int count = 0;
        for (Pet p : petList) {
            if (p != null) 
                count++;
        }
        return count;
    }
    
    @Override
    public String toString() {
        int available = 0;
        int adopted = 0;
        int max = petList.length;
        for (Pet p : petList) {
            if (p != null) {
                if (p.getState() == StatePets.AVAILABLE) {
                    available++;
                } else if (p.getState() == StatePets.ADOPTED) {
                    adopted++;
                }
        }
        }
        return "Shelter: " + "id: " + id + ", locate: " + locate + ", maxCapacity: " + maxCapacity + ", PetList: " + max + "available" + available + "Adopted" + adopted;
}
}