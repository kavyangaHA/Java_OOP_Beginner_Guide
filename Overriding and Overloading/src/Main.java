//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Overloading
    Calculator calc = new Calculator();
    System.out.println(calc.add(5,10));
    System.out.println(calc.add(2.2,3.5));

        //Overriding
        Printer myPrinter = new ColorPrinter();
        myPrinter.print();
    }
}