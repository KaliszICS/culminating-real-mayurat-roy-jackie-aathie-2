/**
 * Mammal is a abstract subclass of AbstractAnimal
 * AbstractAnimal is not a sub class of mammal
 * a mammal is an animal but an animal does not have to be an mammal
 * mammals are warm blooded animals with a vertebrates
 * while we could call fur type hair, we dont have any humans or mammals with hair in our zoo 
 */
public abstract class Mammal extends AbstractAnimal {
  /**
   * fur type of animal. curly thick ....
   */
    protected String furType;
  /**
   * see it inherited everything form abstract animal!!!!
   * @param id:
   * @param name:
   * @param age:
   * @param furType
   */
    public Mammal(int id, String name, int age, String furType) {
        super(id, name, age);
        this.furType = furType;
    }
    /**
     * define what sound the animal makes. 
     * Define what they eat
     * SUBCLASSES MUST HAVE THESE, CAPYBARA INCLUDED.
     */
    public abstract void makeSound();
    public abstract void feed();
}