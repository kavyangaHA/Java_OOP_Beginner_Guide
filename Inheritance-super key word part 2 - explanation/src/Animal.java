public class Animal {
    String name;
    //Parent Constructor
    Animal(String name){
        this.name = name;
    }
    void makeSound(){
        System.out.println("The Animal,"+name+" is making sound.");
    }
}
