public class Toaster implements Powerable {

    @Override
    public void turnOn(){
        System.out.println("Heating up the coils...");
    }

    @Override
    public void turnOff(){
        System.out.println("Toaster is cooling down.");
    }

}
