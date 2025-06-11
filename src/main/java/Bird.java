public abstract class Bird extends AbstractAnimal {
protected double wingspan;
    protected boolean canFly;

    public Bird(int id, String name, int age, double wingspan, boolean canFly) {
super(id, name, age);

    this.wingspan = wingspan;

        this.canFly = canFly;
            }

public abstract void feed();

    public abstract void makeSound();

            
            }