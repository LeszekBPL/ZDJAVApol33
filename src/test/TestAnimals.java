package test;

import animals.Cat;
import animals.Dog;

import java.util.Arrays;

public class TestAnimals {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Filemon");

        Cat cat2 = new Cat();
        cat2.setName("Feliks");
        cat2.kill();
        Cat cat3 = new Cat();
        cat3.setName("Mruczek");
        cat3.kill();


        Dog dog = new Dog();
        dog.setName("Reksio");

//        Cat[] cats = {cat1, cat2, cat3};
//        for (Cat animal : cats) {
//            if(animal.isAlive()){
//            System.out.println(animal.getName());}
        Object[] animals = {cat1, cat2, cat3, dog};
        for (Object animal : animals) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                boolean isAlive=cat.isAlive();
                if (isAlive){
              System.out.println(cat.getName());}

            } else if (animal instanceof Dog) {
                Dog convertedDog = (Dog) animal;
                if(convertedDog.isAlive()){
                System.out.println(convertedDog.getName());}
            }
        }


    }

}

