package factoryPattern;

public class PetRecord {
    private String petId;
    private String petName;
    private Pet pet;

    public PetRecord() {}

    public PetRecord(String petId, String petName, Pet pet) {
        this.petId = petId;
        this.petName = petName;
        this.pet = pet;
    }

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
