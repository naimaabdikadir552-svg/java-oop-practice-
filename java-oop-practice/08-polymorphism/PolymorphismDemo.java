class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moos");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal first = new Dog();
        Animal second = new Cat();
        Animal third = new Cow();

        first.sound();
        second.sound();
        third.sound();
    }
}