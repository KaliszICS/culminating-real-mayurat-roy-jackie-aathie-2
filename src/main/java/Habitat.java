/* Habitat is just a fancy way of saying where an animal lives */
/* creates one with a name, a capacity, and. a temperature  */
public class Habitat {
    private String name; // something like savannah or jungle
    private int capacity; // how much each can hold, 
    private double temperature; // the temp of it. some animals can only thrive in specfic cold/warm temperatures. dont expect like a peinguin in a hot jungle
    private AbstractAnimal[] animals;
    private int count = 0; // counting the animals

    /**
     * Constructs a Habit with the specified name capacity and temp.
     *
     * @param name the name of the habit
     * @param capacity the max. num. of anmials the habit can hold
     * @param temperature the temperature of the habit
     */
    public Habitat(String name, int capacity, double temperature) {
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

    /**
     * Returns the array of animals currently in the habitat.
     *
     * @return an array of AbstractAnimal objects
     */
    public AbstractAnimal[] getAnimals() {
    return animals;
    }

    //getters and setters we also use, extremely repetivtive
    
    /**
     * Returns the name of the habitat.
     *
     * @return the habitat's name
     */
    public String getName() {
    return name;
    }

    /**
     * Returns the tempe of the habitat.
     *
     * @return the habits temperature
     */
    public double getTemperature() {
    return temperature;
    }
}