/**
 * Created by h205p2 on 9/21/17.
 */
public class Tiger extends Animal {

    public Tiger(String name) {

        super(name, "meat");

    }

    /* public void sleep() {

        System.out.println(this.name + " slept for 8 hours!");

    }

    public void eat(String food) {

        System.out.println(this.name + " eats " + food);

        if (food == favoriteFood) {

            System.out.println("YUM! " + this.name + " wants more " + food);

        }

    }
*/


    public static void main(String[] args) {

        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        tigger.sleep();

    }

}
