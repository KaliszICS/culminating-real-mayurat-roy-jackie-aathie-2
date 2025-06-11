/*
* a bird is a warm blooded vertebrae with feathers and wings
* just because they have wings doesn't mean that they can all fly
* for example, a penguin cant fly sadly
* creates bird with a wingspan that may or may not fly
* 
*/
public abstract class Bird extends AbstractAnimal {
/*
 * the wing span of the bird, in meters
 * if the bird can fly
 */
protected double wingspan;
    protected boolean canFly;

/*
 * constructs a bird with the parameters above
 * @param id: the unique id of the animal
 * @param name: the name of the animal
 * @param age: the age of the animal
 * @param wingspan: how long their wings are
 * @param canFly: can they fly
 * see it inherited from AbstractAnimal but has its own unique parameters!!
 * 
 */

    public Bird(int id, String name, int age, double wingspan, boolean canFly) {
super(id, name, age);


    this.wingspan = wingspan;

        this.canFly = canFly;
            }
/*
 * abstract method to feed them
 * 
 */
public abstract void feed();

/* abstract method to have them make sound
 * "chirps"
 */
    public abstract void makeSound();

            
            }