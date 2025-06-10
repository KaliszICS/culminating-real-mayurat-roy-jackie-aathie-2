<<<<<<< HEAD
public class Capybara extends Mammal {
public Capybara(int id, String name, int age) {
super(id, name, age, "Short brown fur");
    }
    @Override

 public void feed()    
 {
    System.out.println(name + " (Capybara) eats grass.");
       }
    @Override
    public void makeSound() {
        System.out.println(name + " (Capybara) squeaks.");
    }
}
=======
public abstract class Mammal extends AbstractAnimal {
    protected String furType;

    public Mammal(int id, String name, int age, String furType) {
        super(id, name, age);
        this.furType = furType;
    }

    public abstract void makeSound();
    public abstract void feed();
}
>>>>>>> 6c79301 (wrong file)
