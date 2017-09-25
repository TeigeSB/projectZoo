/**
 * Created by h205p2 on 9/21/17.
 */

import java.lang.reflect.Array;
import java.util.*;

public class Runner {

    public static void main(String[] args) {

        ArrayList<Animal> array = ;

        Animal Tigger = new Tiger("Tigger");
        Animal Pooh = new Bear("Pooh");
        Animal Mark = new Unicorn("Mark");
        Animal Becca = new Giraffe("Becca");
        Animal Stinger = new Bee("Stinger");
        Zookeeper Zoebot = new Zookeeper("Zoebot");
/*      Tigger.eat("meat");
        Pooh.eat("fish");
        Pooh.eat("meat");
        Mark.eat("marshmallows");
        Becca.eat("meat");
        Becca.eat("leaves");
        Stinger.eat("ice cream");
        Stinger.eat("pollen");
*/

        Zoebot.feedAnimals(array, "Ravioli");
        }



    }


