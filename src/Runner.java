/**
 * Created by h205p2 on 9/21/17.
 */

import java.util.*;

public class Runner {

    public static void main(String[] args) {

        ArrayList<Animal> animal = new ArrayList<>();

        Zookeeper Zoebot = new Zookeeper("Zoebot");

        Animal Tigger = new Tiger("Tigger");
        Animal Pooh = new Bear("Pooh");
        Animal Mark = new Unicorn("Mark");
        Animal Becca = new Giraffe("Becca");
        Animal Stinger = new Bee("Stinger");

        animal.add(Tigger);
        animal.add(Pooh);
        animal.add(Mark);
        animal.add(Becca);
        animal.add(Stinger);

        Tigger.populationCount();
        Pooh.populationCount();
        Mark.populationCount();
        Becca.populationCount();
        Stinger.populationCount();

        Zoebot.feedAnimals(animal, "Ravioli");
        }



    }


