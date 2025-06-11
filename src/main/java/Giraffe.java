/**
 * Giraffe class
 * Inherites from Mammal
 * Giraffes is a type of mammal but a mammal is not a type of giraffe
 * @override is not needed but i cant break the habit
 */
public class Giraffe extends Mammal        
//a giraffe is a animal with big neck
{
/*
 * constructs the giraffe
 * @param Id: the id of the giraffe
 * @param name: the name of the giraffe
 * @param age: the age of the giraffe
 * see it inherited from abstract animal again
 */
    public Giraffe(int id, String name, int age) {

super(id, name, age, "Spotted fur"); // used to refer to the superclass inside the parent class

   

}

    @Override

/*
 * feeding them using abstract
 * every animal eats something them
 */

        public void feed()  

         {

    System.out.println(name + " (Giraffe) eats leaves."); // something like "Ronny (Giraffe) eats leaves"

   

}


/* sound using abstract
 * every animal eats something else
 */
        @Override

    public void makeSound()

    {

        System.out.println(name + " (Giraffe) hums."); // something like "Bobby (Giraffe) Hums"

        }

}