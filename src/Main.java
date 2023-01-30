import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
   Animal[] animal  = {
                new Shark("abc"),
                new Shark("dfg"),
                new Shark("hij"),
                new Shark("shark"),
                new Shark("sha"),
                new Turtle("turtle"),
                new Turtle("turtl"),
                new Turtle("turt"),
                new Turtle("tur"),
                new Turtle("tu"),
                new Eagle("eagle"),
                new Eagle("eagl"),
                new Eagle("eag"),
                new Eagle("ea"),
                new Eagle("e")};

         Turtle[] turtles = new Turtle[animal.length/3];
         Shark[] sharks = new Shark[5];
         Eagle[] eagles = new Eagle[5];

         int t = 0;
         int s = 0;
         int e = 0;
   for(Animal a:animal){
       if (a.getClass().getName().equals("Shark")){
           ((Shark)a).attack();
           a.run();
           sharks[s] = (Shark) a;
           s++;
       }else if (a.getClass().getName().equals("Eagle")){
           ((Eagle)a).fly();
           a.run();
           eagles[e]=(Eagle) a;
           e++;
       }else if (a.getClass().getName().equals("Turtle")){
           ((Turtle)a).swim();
           a.run();
           turtles[t] = (Turtle) a;
           t++;
       }


   }
        System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(turtles));
        System.out.println(Arrays.toString(eagles));
    }
}