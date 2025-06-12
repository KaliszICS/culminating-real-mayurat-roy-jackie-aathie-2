/* the backbone of our code
 * Zoo combines all our staff and habitats
 * we dont pay our staff, prob could add that if we had more time
 * free labour!!!
 * uses loops to find stuff in our zoo
 * 
 */
public class Zoo {
    /*
     * Array of habitats and staff in the zoo
     */
    private Habitat[] habitats;
    private Staff[] staff;

    /*
     * constructs zoo with habitats and staff
     * @param Habitats: an array of habitats. 
     * @param staff: an array of staff on our zoo
     */

    public Zoo(Habitat[] habitats, Staff[] staff) {
        // assigning the staff and habitats. Forcing the staff to work too for no pay!!
        this.habitats = habitats; // can use this.habitat or just habitats. JUST STAY consistent
        this.staff = staff; // same thing
    }

    // adds an animal to a specfic habitat by using it index

    public void addAnimal(AbstractAnimal a, int habitatIndex) {
        habitats[habitatIndex].addAnimal(a); // does the actual adding
    }
    // scours for the animal accross every single habitat. scours every single inch of every single habitat

    public AbstractAnimal findAnimal(String name) {
        //loops through each habitat to find the one it wants
        // does not take very long unlike in real life
        
        for (Habitat h : habitats) {
            //loop through each animal in each habitat
            
            for (AbstractAnimal a : h.getAnimals()) {
                // checks if the animal exists and its name 
                if (a != null && a.getName().equals(name)) {
                    return a; // return the animal if does
                }
            }
        }
        return null; 
    }
    /*
     * prints the details. something like "Savannah Perry + (19°C))"
     *  use loops to list animals
     */ 
                    public void listAllAnimals() {
                    for (Habitat h : habitats) {
            System.out.println("Habitat: " + h.getName() + " (Temp: " + h.getTemperature() + "°C)");
for (AbstractAnimal a : h.getAnimals()) 
{
    // if it empty return null. i dont want to return a ghost
if (a != null) {
    
 System.out.println("  - " + a.getInfo());
}
}
}
  
}
}

    