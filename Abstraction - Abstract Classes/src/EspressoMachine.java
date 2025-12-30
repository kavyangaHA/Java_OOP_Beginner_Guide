public class EspressoMachine extends CoffeeMachine {
    @Override
    void brew(){
        System.out.println("Forcing high-pressure water through grounds...");
    }

}
