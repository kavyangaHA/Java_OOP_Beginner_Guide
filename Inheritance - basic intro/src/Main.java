//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.name="Buddy";
        myDog.eat(); //This comes from Animal cls

        myDog.bark();//This comes from Dog cls

        Cat myCat = new Cat();
        myCat.name="Blacky";

        myCat.eat();
        myCat.makeSound();

        Animal animal_1=new Animal();
        animal_1.makeSound();

    }
}