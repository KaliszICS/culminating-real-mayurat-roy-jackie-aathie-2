public class Zoo {
    private Habitat[] habitats;
    private Staff[] staff;

    public Zoo(Habitat[] habitats, Staff[] staff) {
        this.habitats = habitats;
        this.staff = staff;
    }

    public void addAnimal(AbstractAnimal a, int habitatIndex) {
        habitats[habitatIndex].addAnimal(a);
    }

    public AbstractAnimal findAnimal(String name) {
        for (Habitat h : habitats) {
            for (AbstractAnimal a : h.getAnimals()) {
                if (a != null && a.getName().equals(name)) {
                    return a;
                }
            }
        }
        return null;
    }

                    public void listAllAnimals() {
                    for (Habitat h : habitats) {
            System.out.println("Habitat: " + h.getName() + " (Temp: " + h.getTemperature() + "°C)");
for (AbstractAnimal a : h.getAnimals()) 
{
if (a != null) {
 System.out.println("  - " + a.getInfo());
}
}
}
  
}
}
//add getter for the yeelow
    