import java.util.*;

public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat();
        Dog dog=new Dog();
        cat.sound();
        dog.sound();

        ArrayList<Animal> list=new ArrayList<>();
        list.add(dog);
        list.add(cat);

        Test<String> tt=new Test();

        Animal a=list.get(1);
        if (a instanceof Dog){
            ((Dog)a).dogOnly();
        }

    }





}