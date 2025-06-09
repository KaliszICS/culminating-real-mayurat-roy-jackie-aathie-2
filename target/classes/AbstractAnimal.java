/* the base class for every animal, capybara included */
/* created mostly by Jackie */
/* Abstact class */
/* unique id for each animal */
/* they must have these!!! */

public abstract class AbstractAnimal {
    protected int id;

    /* name of the animal ie: Capybara */

    protected String name;

    /* Name of the animal */

    protected int age;

    public AbstractAnimal(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public abstract void feed();
    public abstract void makeSound();


    public void move() {
        System.out.println(name + "is moving")
    }

    public String getInfo() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}