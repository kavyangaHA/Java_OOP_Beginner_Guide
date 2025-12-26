public class Dog extends Animal{
    String breed;
    //String name;
    Dog(String breed){
        //super(name);
        //this.name=name;
        this.breed = breed;
    }
    @Override
    void makeSound(){
        super.makeSound();
        System.out.println(name+ " is barking");
    }
}
