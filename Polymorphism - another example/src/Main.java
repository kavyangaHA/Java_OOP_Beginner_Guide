import java.lang.reflect.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape circle_1 = new Circle();
        Shape square_1 = new Square();

        ArrayList<Shape>shapes = new ArrayList<>();
        shapes.add(circle_1);
        shapes.add(square_1);

        for ( Shape s:shapes){
            s.draw();
        }


    }
}