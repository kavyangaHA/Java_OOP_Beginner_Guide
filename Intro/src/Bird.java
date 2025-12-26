public class Bird {
    int age;
    String name;
    String color;

    Bird(String birdName, int birdAge,String birdColor){
        age = birdAge;
        name = birdName;
        color = birdColor;

    }

    void displayInfo(){
        System.out.println("My Bird's name is "+ name+" He is "+age+" years old. It's color is "+ color);

    }
}
