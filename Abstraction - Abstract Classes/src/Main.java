//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EspressoMachine e1 = new EspressoMachine();
        e1.brew();
        e1.boilWater();


    }
}
//NOTE
//In Java, both Abstract Classes and Interfaces are "incomplete." tHEREFORE CREATING OBJECTS FROM EITHER OF THEM CANNOT BE DONE.
// Trying to create an object from them would be like trying to buy
// "a generic Animal" or "a generic Powerable thing"—it doesn't exist in the real world.