public abstract class Mammal extends AbstractAnimal {
    protected String furType;

    public Mammal(int id, String name, int age, String furType) {
        super(id, name, age);
        this.furType = furType;
    }

    public abstract void makeSound();
    public abstract void feed();
}