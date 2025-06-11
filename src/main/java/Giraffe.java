public class Giraffe extends Mammal        

{

    public Giraffe(int id, String name, int age) {

super(id, name, age, "Spotted fur");

   

}



    @Override



        public void feed()  

         {

    System.out.println(name + " (Giraffe) eats leaves.");

   

}



        @Override

    public void makeSound()

    {

        System.out.println(name + " (Giraffe) hums.");

        }

}
