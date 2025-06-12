/* Habitat is just a fancy way of saying where an animal lives */
/* creates one with a name, a capacity, and. a temperature  */
public class Habitat {
    private String name; // something like savannah or jungle
    private int capacity; // how much each can hold, 
    private double temperature; // the temp of it. some animals can only thrive in specfic cold/warm temperatures. dont expect like a peinguin in a hot jungle
    private AbstractAnimal[] animals;
    private int count = 0; // counting the animals

    public Habitat(String name, int capacity, double temperature) 
    {
    this.name = name;
       this.capacity = capacity;
     this.temperature = temperature;
     
        this.animals = new AbstractAnimal[capacity];
    }

    public void addAnimal(AbstractAnimal a) 
    {
            if (count < capacity) 
            {
        animals[count++] = a;
                                } else {
            System.out.println("Habitat is full.");
        }
    }

    public AbstractAnimal[] getAnimals() {
        return animals;
    }

    //getters and setters we also use, extremely repetivtive
    
    public String getName() {
        return name;
    }
    public double getTemperature() {
    return temperature;
}
}