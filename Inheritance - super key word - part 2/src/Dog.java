public class Dog extends Animal {
    //sub cls of Animal cls
    void bark(){
        //Unique method just for Dogs
        System.out.println("Woof! I am " + name);
    }
    @Override
    void makeSound(){
        System.out.println(name+" is barking. Woof!" +
                " Woof!");
    }
}