public class Eagle extends Bird
                      {
    public Eagle(int id, String name, int age) {
    
        super(id, name, age, 2.0, true);
    }

     @Override

        public void feed() 
        {
    
            System.out.println(name + " (Eagle) eats fish.");
    }

         @Override
    public void makeSound() {

    System.out.println(name + " (Eagle) screeches.");
    
}
            }