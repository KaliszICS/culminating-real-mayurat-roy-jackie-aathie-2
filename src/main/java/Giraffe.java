/**
 * Giraffe class
 * Inherites from Mammal
 * Giraffes is a type of mammal but a mammal is not a type of giraffe
 * 
 */
public class Giraffe extends Mammal        
//a giraffe is a animal with big neck
{

    public Giraffe(int id, String name, int age) {

super(id, name, age, "Spotted fur");

   

}

    @Override



        public void feed()  

         {

    System.out.println(name + " (Giraffe) eats leaves."); // something like "Ronny (Giraffe) eats leaves"

   

}



        @Override

    public void makeSound()

    {

        System.out.println(name + " (Giraffe) hums."); // something like "Bobby (Giraffe) Hums"

        }

}