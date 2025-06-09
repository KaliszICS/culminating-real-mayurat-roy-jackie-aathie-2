public abstract class AbstractAnimal {
    protected int id;
    protected String name;
    protected int age;

    private static int idCounter = 0;

    public AbstractAnimal(String name, int age) {
        id = idCounter++; 
        this.name = name;
        this.age = age;
    }

    public abstract void feed();
    public abstract void makeSound();

    public void move() {
        System.out.println(name + " is moving.");
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
