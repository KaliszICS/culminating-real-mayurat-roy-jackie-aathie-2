/*
 * Staff are members of the zoo that feed animals
 * Each member has a specific id and name, and a also a role ie "Zookeeper & Capybara feeder"
 * 
 */
public class Staff {
    private int id; // the unique id just about everyone has
    private String name; // name of the staff
    private String role; // what they do ie "capybara keeper"
    /*
     * Constructs the staff
     * @param name: the name of the staff
     * @param id: the id of the staff
     * @param role: the role of the staff or what they do
     */
    public Staff(int id, String name, String role) {
        this.id = id; // this.id or no this at all is fine. just stick with oen
        this.name = name;
        this.role = role;
    }
    /* 
     * Abstract feeding
     * @param a: short for abstractanimal. its what animal they are feeding
     */
    public void feedAnimal(AbstractAnimal a) {
        System.out.println(name + " is feeding " + a.getName()); // something like "Catherine is feeding Perry"
        a.feed();
    }


    /*
     * generic returners so i can access the private variables
     * extremely repetitive
     */
    public String getName() {
        return name;
    }
     public int id() {
    return id;

}
 public String role() {
    return role;
}
}
