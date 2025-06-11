public class ZooTest {
    public static void main(String[] args) {
        // 1. Create Habitats
        Habitat forest = new Habitat("Forest", 3, 22.0);
        Habitat savannah = new Habitat("Savannah", 3, 30.0);
        Habitat mountains = new Habitat("Mountains", 2, 15.0);

        Habitat[] habitats = { forest, savannah, mountains };

        // 2. Create Staff
        Staff alice = new Staff(1, "Alice", "Feeder");
        Staff bob = new Staff(2, "Bob", "Caretaker");

        Staff[] staff = { alice, bob };

        // 3. Create Zoo
        Zoo zoo = new Zoo(habitats, staff);

        // 4. Create Animals
        Capybara cappy = new Capybara(101, "Cappy", 4);
        Giraffe gemma = new Giraffe(102, "Gemma", 6);
        Eagle ernie = new Eagle(103, "Ernie", 5);
        Owl oscar = new Owl(104, "Oscar", 2);

        // 5. Add Animals to Habitats
        zoo.addAnimal(cappy, 1);    // Savannah
        zoo.addAnimal(gemma, 1);    // Savannah
        zoo.addAnimal(ernie, 2);    // Mountains
        zoo.addAnimal(oscar, 0);    // Forest

        // 6. Staff feeding animals
        alice.feedAnimal(cappy);
        bob.feedAnimal(oscar);

        System.out.println();

        // 7. Find an animal by name and interact
        AbstractAnimal found = zoo.findAnimal("Gemma");
        if (found != null) {
            System.out.println("Found animal: " + found.getInfo());
            found.makeSound();
            found.move();
        } else {
            System.out.println("Animal not found.");
        }

        System.out.println();

        // ✅ 8. List all animals (Zoo has listAllAnimals method now)
        System.out.println("Animals in the Zoo:");
        zoo.listAllAnimals();  // ✅ Correct!
    }
}