// Superclass Animal
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Interface Colorable to demonstrate multiple inheritance
interface Colorable {
    String getColor();
}

// Subclass Dog inheriting from Animal 
class Dog extends Animal implements Colorable {
    private String color;

    public Dog(String color) {
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }

    @Override
    public String getColor() {
        return color;
    }
}

// Subclass Cat inheriting from Animal 
class Cat extends Animal implements Colorable {
    private String color;

    public Cat(String color) {
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }

    @Override
    public String getColor() {
        return color;
    }
}


public class PetAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog("Brown");
        Cat cat = new Cat("Black");

        System.out.println("Dog: ");
        dog.makeSound();
        System.out.println("Color: " + dog.getColor());

        System.out.println("\nCat: ");
        cat.makeSound();
        System.out.println("Color: " + cat.getColor());
    }
}
