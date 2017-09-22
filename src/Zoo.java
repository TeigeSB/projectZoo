/**
 * Created by h205p2 on 9/21/17.
 */
public class Zoo {

    String favoriteFood = "bacon";

    public static void main(String[] args) {

        Zoo z = new Zoo();
        z.eat("Tigger", "meat");
        z.sleep("Tigger");
        z.eat("Tigger", "bacon");



        }

    public void sleep(String name) {

        System.out.println(name + "slept for 8 hours!");

    }

    public void eat(String name, String food){

        System.out.println(name + " eats " + food);

        if (food == favoriteFood) {

            System.out.println("YUM! " + name + " wants more " + food);

        }

    }




}


