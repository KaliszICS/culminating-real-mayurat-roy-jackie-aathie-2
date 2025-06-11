public class Staff {
    private int id;
    private String name;
    private String role;

    public Staff(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public void feedAnimal(AbstractAnimal a) {
        System.out.println(name + " is feeding " + a.getName());
        a.feed();
    }

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
