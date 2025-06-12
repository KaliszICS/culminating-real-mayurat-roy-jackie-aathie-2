/* Capybara class
 * A capybara is a giant rodent
 * the largest one in fact
 * just like mayurun they eat their own poop
 * unlike mayurun they are quite friendly 
 * override is not need again!!
 * I wanted to created an limit or method that doesnt allow you to feed the capybara and every other animal too much, but time was lost
 *
 */ 

 /*
  * constucks a capybara with a unique id, name and a age
  *
  */
public class Capybara extends Mammal {
    /*
     * Super calls the superclass method, specificly the fur type we made in mammal class
     * 
     */
public Capybara(int id, String name, int age) {
    /*
     * capybara's have a similar fur type to dogs
     * unfortunately they dont live very long just like dogs
     * age span 0-12 years
     * 
     */
super(id, name, age, "Short brown wiry fur"); 
    }
    @Override

    /*
     * capybaras are plant eaters, and wont eat meat
     * they eat a variety of greens and love melons and other fruits 
     * extremely cute animal!!
     * Feed class, carried from abstract animal
     * 
     */
 public void feed()    
 {
    System.out.println(name + " (Capybara) eats grass and melon."); // something like "Perry (Capybara) eats grass and melon"
       }
    @Override
    /* sound class*/ 
    /*
     * from abstract animal
     * capybaras can bark like dogs and also squeak like them while in danger 
     */
    public void makeSound() {
        System.out.println(name + " (Capybara) barks."); // something like "Perry (Capybara) barks"
    }
}
