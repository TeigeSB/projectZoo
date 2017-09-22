/**
 * Created by h205p2 on 9/22/17.
 */
public class Bee extends Animal  {

    public Bee(String name) {

        super(name, "pollen");

    }

    public void sleep() {

        System.out.println(this.name + " never sleeps");

    }

    public void eat(String food) {

        if (food != this.favoriteFood) {

            System.out.println("YUCK! " + this.name + " won't eat " + food);

        } else if (food == favoriteFood) {

            System.out.println(this.name + " eats " + food);
            System.out.println("YUM! " + this.name + " wants more " + food);
            sleep();

        }

    }

}
