public class Lamp implements Powerable{
    @Override
    public void turnOn(){
        System.out.println("Light bulb is glowing!");
    }

    @Override
    public void turnOff(){
        System.out.println("Light is out.");
    }
}
