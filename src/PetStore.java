import java.util.ArrayList;

class PetStore {
    private ArrayList<Animal> animals;

    public PetStore() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(String name) {
        boolean removed = false;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).name.equals(name)) {
                animals.remove(i);
                System.out.println("the animal " + name + " has been removed");
                removed = true;
                break;
            }
        }
        if (!removed)
            System.out.println("an animal with the name " + name + " was not found");
    }

    public void listAnimals() {
        System.out.println("----------");
        for (Animal animal : animals) {
            System.out.println(animal.getInfo());
        }
        System.out.println("----------");
    }

    public void customizeAnimalInfo(String name, String customInfo) {
        for (Animal animal : animals) {
            if (animal.name.equals(name)) {
                animal.customizeInfo(customInfo);
            }
        }
    }
}