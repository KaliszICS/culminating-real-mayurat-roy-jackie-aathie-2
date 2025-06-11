public class Giraffe extends Mammal        
//a giraffe is a animal with big neck
{
// constructs our girafee with the things inherited from abstract animal
    public Giraffe(int id, String name, int age) {
// they have spotted fur
super(id, name, age, "Spotted fur");

   

}



    @Override


//giraffes ususally eats leaves
        public void feed()  

         {

    System.out.println(name + " (Giraffe) eats leaves.");

   

}


// they usally make the sound hum
        @Override

    public void makeSound()

    {

        System.out.println(name + " (Giraffe) hums.");

        }

}