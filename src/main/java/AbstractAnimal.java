/**
 * 
 * Abstract Animal Class 
 * gives each animal 3 things, capybara included 
 * FORCES EACH ANIMAL TO MAKE A SOUND AND EAT 
 * literally the center of our uml
 * i wish we can actually play the sound through the speakers in the computers but limits exist :(
 * 
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

    /** 
     * @param id the id of the animal
     * @param name the name of the animal
     * @param age the age of the animal
     * creates the AbstractAnimal with its info
     */
    public AbstractAnimal(int id, String name, int age) {
        this.id = id; // you can either use this.id or id to call back on to this later one. ASLONG AS YOU ARE CONSISTENT 
        this.name = name; // use name or this.name
        this.age = age;
    }

    /**
     * how the animal is fed
     * SUB CLASSES MUST HAVE THIS.
     */
    public abstract void feed();

    /**
     * how the animal makes a sound
     * SUB CLASSES MUST HAVE THIS.
     */
    public abstract void makeSound();

    /**
     * checks if the animal is moving "Capybara moves around"
     * SUBCLASSES MUST HAVE THIS
     */
    public void move() {
        System.out.println(name + " moves around.");
    }

    /**
     * String rep of the animal and their info
     * @return something like "Capybara ID: 12132121321, Age: 2"
     */
    public String getInfo() {
        return (name + " (ID: " + id + ", Age: " + age + ")"); // something like "ID 231232312 Age 923287123 "
    }

    /**
     * @return name: the name of the animal
     * we can actually access the private variables now
     */
    public String getName() {
        return name; // return name
    }

    /**
     * @return id: the id we gave the animal, lol what else could it mean
     */
    public int getId() {
        return id;
    }
}
