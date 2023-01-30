public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void run(){
    System.out.println("animals are run");

}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
