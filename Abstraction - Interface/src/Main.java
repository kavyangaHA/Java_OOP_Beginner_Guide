//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Powerable device1 = new Toaster();
        Powerable device2 = new Lamp();

        device2.turnOn();
        device2.turnOff();
        device1.turnOn();
        device1.turnOff();
    }
}