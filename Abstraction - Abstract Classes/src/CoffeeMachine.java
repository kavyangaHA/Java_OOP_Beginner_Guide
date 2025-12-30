abstract class CoffeeMachine {
    //This is an abstract method("The concept")
    abstract void brew();

    //This is a regular method (Common functionality)
    void boilWater(){
        System.out.println("Boiling water at 95°C...");
    }

}
