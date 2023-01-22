public class Main {
    public static void main(String[] args) {
   Animal[] animal  = {new Shark(),new Eagle(), new Turtle()};
   for(Animal a:animal){
       a.run();
       if (a.getClass().getName().equals("Shark")){
           ((Shark)a).attack();
       }else if (a.getClass().getName().equals("Eagle")){
           ((Eagle)a).fly();
       }else if (a.getClass().getName().equals("Turtle")){
           ((Turtle)a).swim();
       }


   }
    }
}