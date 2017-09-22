/**
 * Created by h205p2 on 9/22/17.
 */
public class Giraffe extends Animal {

    public Giraffe(String name) {

        super(name, "leaves");

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
