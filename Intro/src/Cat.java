public class Cat {
    //here let's learn about constructors
    // in the Dog cls we did not use constructions we just use attributes
    String color;
    int age;
    Cat(String catColor,int catAge){
        color = catColor;
        age = catAge ;
        System.out.println("A new cat object has been created!");
    }

    void displayInfo(){
        System.out.println("I am a " + color + " cat. and I am " + age + " years old.");
    }
}
// why is the using constructor is better?
// we force the programmer to provide color and age,they can't create an "empty"
//dog by mistakenly.
//also it reduce the number of lines of code;
