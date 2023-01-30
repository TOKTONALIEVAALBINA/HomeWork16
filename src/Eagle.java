public class Eagle extends Animal{
    public Eagle(String name) {

        super(name);
    }

    public void fly(){
        System.out.println(getName()+" can fly");
    }

    @Override
    public void run() {
        System.out.println(getName()+" is eating");
    }
}
