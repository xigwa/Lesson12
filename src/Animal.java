abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getInfo();
    public abstract void customizeInfo(String customInfo);
}

class Dog extends Animal {
    private String breed;
    private String customInfo;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String getInfo() {
        return "Dog: Name: " + name + ", Age: " + age + ", Breed: " + breed + ", Custom Info: " + customInfo;
    }

    @Override
    public void customizeInfo(String customInfo) {
        this.customInfo = customInfo;
    }
}
