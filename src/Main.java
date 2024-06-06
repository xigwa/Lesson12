public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        Manager manager = new Manager("Alex", 1, 8000, "HR");
        Engineer engineer = new Engineer("Tom", 2, 6000, "Software Development");

        company.addEmployee(manager);
        company.addEmployee(engineer);
        company.listEmployees();
        company.removeEmployee(1);
        company.listEmployees();
        company.removeEmployee(3);


        PetStore petStore = new PetStore();

        petStore.addAnimal(new Dog("Buddy", 3, "Labrador"));
        petStore.addAnimal(new Cat("Whiskers", 5, "White"));

        petStore.customizeAnimalInfo("Buddy", "Loves playing fetch");
        petStore.listAnimals();
        petStore.removeAnimal("Buddy");
        petStore.listAnimals();



    }
}