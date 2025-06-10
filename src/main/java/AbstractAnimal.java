/**
* Abstract Animal Class 
* gives each animal 3 things, capybara included 
* FORCES EACH ANIMAL TO MAKE AN SOUND AND EAT 
*/
public abstract class AbstractAnimal {
    /** 
    * Unique id for each animal
    * Unique Name for each name ie: Capybara
    * Unique name for age.
    */
    protected int id;
    protected String name;
    protected int age;

    /* 
    * create a bunch of generic id for each animal but they are unique 
    */

    private static int idCounter = 0;
    /**
     * 
     * @param name: name of the animal wow
     * @param age: age of the animal wow
     * actually not constructs the AbstractAnimal with the name and the age
     * 
     */
    public AbstractAnimal(String name, int age) {
        id = idCounter++; 
        this.name = name;
        this.age = age;
    }

    /**
     * how the animal is fed
     * SUB CLASSES MUST HAVE THESE.
     */
    public abstract void feed();
    public abstract void makeSound();

    /**
     * checks if the animal is moving "Capybara is moving"
     */
    public void move() {
        System.out.println(name + " is moving.");
    }
    /**
     * String rep of the animal
     */
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
    /**
     * generic basic getters and setters
     * @return id: the id we created eariler
     * @return name: the name of the animal
     * @return age : their ages.
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
