/**
 * Created by h205p2 on 9/21/17.
 */
public class Tiger {

    String favoriteFood = "meat";
    String name = "";


    public Tiger(String name) {
        this.name = name;

    }

    public void sleep() {

        System.out.println(this.name + " slept for 8 hours!");

    }

    public void eat(String food) {

        System.out.println(this.name + " eats " + food);

        if (food == favoriteFood) {

            System.out.println("YUM! " + this.name + " wants more " + food);

        }

    }



    public static void main(String[] args) {
        //either make a new instance of a Zoo
        //to call the non-static sleep method....
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        tigger.sleep();

    }

}
