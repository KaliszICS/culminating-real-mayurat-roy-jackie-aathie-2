public class ZooTest {
// no comments or java docs needed !!!!!!!!!!!!!!!!!!!!!!!!
//
//disregard zootest not apart of code

    public static void main(String[] args) {
        
        Habitat forest = new Habitat("Forest", 3, 22.0);
        Habitat savannah = new Habitat("Savannah", 3, 30.0);
        Habitat mountains = new Habitat("Mountains", 2, 15.0);

        Habitat[] habitats = { forest, savannah, mountains };

        
        Staff alice = new Staff(1, "Alice", "Feeder");
        Staff bob = new Staff(2, "Bob", "Caretaker");

        Staff[] staff = { alice, bob };

       
        Zoo zoo = new Zoo(habitats, staff);

        
        Capybara cappy = new Capybara(101, "Cappy", 4);
        Giraffe gemma = new Giraffe(102, "Gemma", 6);
        Eagle ernie = new Eagle(103, "Ernie", 5);
        Owl oscar = new Owl(104, "Oscar", 2);

       
        zoo.addAnimal(cappy, 1);    
        zoo.addAnimal(gemma, 1);  
        zoo.addAnimal(ernie, 2);    
        zoo.addAnimal(oscar, 0);    

       
        alice.feedAnimal(cappy);
        bob.feedAnimal(oscar);

        System.out.println();

        
        AbstractAnimal found = zoo.findAnimal("Gemma");
        if (found != null) {
            System.out.println("Found animal: " + found.getInfo());
            found.makeSound();
            found.move();
        } else {
            System.out.println("Animal not found.");
        }

        System.out.println();

        
        System.out.println("Animals in the Zoo:");
        zoo.listAllAnimals();  
    }
}