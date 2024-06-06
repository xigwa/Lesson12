class Cat extends Animal {
    private String color;
    private String customInfo;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "Cat: Name: " + name + ", Age: " + age + ", Color: " + color + ", Custom Info: " + customInfo;
    }

    @Override
    public void customizeInfo(String customInfo) {
        this.customInfo = customInfo;
    }
}

