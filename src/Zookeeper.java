
/**
 * Created by h205p2 on 9/22/17.
 */

import java.util.*;

public class Zookeeper {

    String name = "";

    Zookeeper(String name) {

        this.name = name;

    }

    public void feedAnimals(ArrayList<Animal> animals, String food) {


        System.out.println(name + " is feeding " + food + " to " + animals.size() + " of " + Animal.population + " total animals.");

        for (int i = 0; i < animals.size(); i ++) {

            animals.get(i).eat(food);

        }

    }

}
