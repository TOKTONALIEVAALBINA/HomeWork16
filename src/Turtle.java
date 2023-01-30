public class Turtle extends Animal {
    public Turtle(String name) {
        super(name);
    }

    public void swim() {
        System.out.println(getName()+" can swim");

    }

    @Override
    public void run() {
        System.out.println(getName()+"  is eating");
    }
}
