//<<<<<<< HEAD
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
