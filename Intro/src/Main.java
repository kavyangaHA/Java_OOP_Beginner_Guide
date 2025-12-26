//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //creating an object named "myDog"

        Dog myDog = new Dog();
        myDog.breed = "Golden Ret";
        myDog.age = 3 ;
        myDog.displayInfo();
        myDog.color = "Golden";
        myDog.bark();

        Cat myCat = new Cat("Orange",3);
        Cat strayCat = new Cat("white",1);

        myCat.displayInfo();
        strayCat.displayInfo();

        myCat.age=10;
        myCat.displayInfo();
        strayCat.color="Brown";
        strayCat.displayInfo();

        Bird mybirdy = new Bird("Tinky",1,"yellow");
        mybirdy.displayInfo();

        mybirdy.color="green";
        mybirdy.displayInfo();




    }
}