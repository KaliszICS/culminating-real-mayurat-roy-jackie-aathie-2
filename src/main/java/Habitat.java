public class Habitat {
    private String name;
    private int capacity;
    private double temperature;
    private AbstractAnimal[] animals;
    private int count = 0;

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

    //getters
    
    public String getName() {
        return name;
    }
    public double getTemperature() {
    return temperature;
}
}