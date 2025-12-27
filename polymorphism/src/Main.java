import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    // Polymorphism: Reference is Animal, but the object is Dog
        Animal myAnimal = new Dog();
        Animal myOtherAnimal = new Cat();
        //Even though the reference is 'Animal,'
        //Java is smart enough to run the Dog's version of makeSound()
        myAnimal.makeSound();
        myOtherAnimal.makeSound();

        //myAnimal.bark()//Error ,When you use a parent reference (like Animal),
        // you can only call methods that exist in the Animal class.
        //to call bark() we need to cast thee animal back into a dog

        ((Dog) myAnimal).bark();




        //why does polymophism  useful?
        //Imagine you are building a game with 100 different
        // types of monsters. Without polymorphism, you would
        // need a separate list for every type. With polymorphism,
        // you can put them all in one list:
        //below is an example

        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(new Dog());
        zoo.add(new Cat());

        for (Animal a: zoo){
            a.makeSound();
            //Everyone makes their own sound
        }


    }
}