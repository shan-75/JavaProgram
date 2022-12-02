//Write a java program to create a class Animal with properties [id, name, color].
// Create another class called Cat and extends it from Animal.
// Add new properties sound in String.
// Create an object of a Cat and print all details.

public class OOP {
    public static void main(String[] args) {
        Cat c= new Cat();
        c.name= "mosu";
        c.color="Blue";
        c.id=25;
        c.sound="Meow Meow";
//        this features is cat class methods also inclues class Animal method.
        c.features();
    }
}
class Animal{
//    properties of class
    int id;
    String name;
    String color;

//methods of class Animal
    void features(){
//        output of methods features class Animal
        System.out.println("The name of the animal is "+ name);
        System.out.println("The color of the animal is "+ color);
        System.out.println("The id of the animal is "+ id);
    }
}
// Cat has inheritated the properties of class Animal
class Cat extends Animal {
    String sound;

    @Override
//    class Cat methods
    void features() {
//        class Animal method
        super.features();
//        output of method features (cat class)
        System.out.println("The sound of the "+ name + sound);
    }
}