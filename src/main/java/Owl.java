public class Owl extends Bird {

    public Owl(int id, String name, int age) {

super(id, name, age, 1.2, true);

    }

@Override

    public void feed() {

System.out.println(name + " (Owl) eats mice.");

    }

@Override

    public void makeSound() {

    System.out.println(name + " (Owl) hoots.");

    }

}
