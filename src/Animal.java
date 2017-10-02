/**
 * Created by h205p2 on 9/21/17.
 */
public class Animal {

    String favoriteFood = "";
    String name = "";
    static int population = 0;

    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        populationCount();



    }

    public void populationCount() {

        population += 1;

        System.out.println(population);

    }

    public void sleep() {

        System.out.println(this.name + " slept for 8 hours!");

    }

    public void eat(String food) {

        System.out.println(this.name + " eats " + food);

        if (food == favoriteFood) {

            System.out.println("YUM! " + this.name + " wants more " + food);

        } else if (food != favoriteFood) {

            sleep();

        }

    }

    public static void main(String[] args) {



    }

    }



