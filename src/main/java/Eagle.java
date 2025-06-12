/*
 * eagle is a type of bird but bird is not a type of eagle. IT ONLY GOES ONE WAY
 * also their wing span is 2 meters. not each wing is 2.2 meters is that when they open their wings they are 2 meters wide
 * implements their feeding too
 * also the sounds they make
 * they can also be tamed like in this zoo
 * 
 */
public class Eagle extends Bird // extends this is how you inherit
/*
 * creates a eagle with an id, a name, and an age
 * Sets the wing span to 2.2 meters
 * @param id: their unique id blah blah
 * @param name: their name. we prob should not give them human names
 * @param age: their age.
 * see these are from abstract animal!!
 */
                      {
    public Eagle(int id, String name, int age) { // constructor
    
        super(id, name, age, 2.0, true);
    }

     @Override
/*
 * what they are feeded
 * eagles can eat alot of things actually, salmon are just cheap here
 * we could also feed them worms but i have a phobia of wamrs
 * 
 */
        public void feed() 
        {
    
            System.out.println(name + " (Eagle) eats salmon."); //prints something like "bobbdy (eagle) eats fish"
    }
/*
 * their sounds
 * they screech alot
 * its kinda of ear deafing 
 * 
 */
         @Override
    public void makeSound() {

    System.out.println(name + " (Eagle) screeches."); // prints some like "Henry (Eagle) Screeches"
    
}
            }