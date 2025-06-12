/* owls are big birds!!
 * an owl is a bird with big eyes and a flat face
 * they can usually fly to a limited extent
 * Owl Class
 */
public class Owl extends Bird { // inherit using extends
    /* constructor to create an owl with a id, name and a age
     * wing span of 1.2 meters and can fly as true
     * @param id: the id we give each animal
     * @param name: the name that we give each animal
     * @param age; the age that we give each animal
     * same params as most other animals
     * hoot
     */

    public Owl(int id, String name, int age) { 

super(id, name, age, 1.2, true); // used to refer back to the superclass

    }

@Override
/* owls need to eat too, even if they seem to stand around all day and do nothing
 * feeding the owl
 * owls usually eat other small animals like mice and insects
 * abstract feeding method
 */
    public void feed() {

System.out.println(name + " (Owl) eats mice."); // "Harry (Owl) eats mice"

    }

/*
 * abstract sound
 * owls creating an hooting sound to usually talk with owl owls and as a instinct 
 */
@Override

    public void makeSound() { // have them make sound

    System.out.println(name + " (Owl) hoots."); // "Harry (Owl) hoots"

    }

}
