public class Shark extends Animal {
    public Shark(String name) {
        super(name);
    }

    public void attack() {
        System.out.println(getName()+" is attack");
    }

    @Override
    public void run() {
        System.out.println(getName()+" is eating");
    }

}
