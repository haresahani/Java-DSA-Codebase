// Base interface for common behaviors
interface Animal {
    void eat();
    void breathe();
}

// Interface for swimming behavior
interface Swimmable {
    void swim();
}

// Interface for walking behavior
interface Walkable {
    void walk();
}

// Derived interface from Animal for fish-specific behaviors
interface Fish extends Animal, Swimmable {
}

// Derived interface from Animal for bird-specific behaviors
interface Bird extends Animal, Walkable {
}

// Derived interface from Animal for mammal-specific behaviors
interface Mammal extends Animal, Walkable {
}

// Classes implementing the interfaces

// Fish
class Shark implements Fish {
    @Override
    public void eat() {
        System.out.println("Shark is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Shark is breathing");
    }

    @Override
    public void swim() {
        System.out.println("Shark is swimming");
    }
}

class Rohu implements Fish {
    @Override
    public void eat() {
        System.out.println("Rohu is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Rohu is breathing");
    }

    @Override
    public void swim() {
        System.out.println("Rohu is swimming");
    }
}

// Bird
class Parrot implements Bird {
    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Parrot is breathing");
    }

    @Override
    public void walk() {
        System.out.println("Parrot is walking");
    }
}

class Peacock implements Bird {
    @Override
    public void eat() {
        System.out.println("Peacock is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Peacock is breathing");
    }

    @Override
    public void walk() {
        System.out.println("Peacock is walking");
    }
}

// Mammal
class Cat implements Mammal {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Cat is breathing");
    }

    @Override
    public void walk() {
        System.out.println("Cat is walking");
    }
}

class Human implements Mammal {
    @Override
    public void eat() {
        System.out.println("Human is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Human is breathing");
    }

    @Override
    public void walk() {
        System.out.println("Human is walking");
    }
}

public class OOPS {
    public static void main(String[] args) {
        // Creating instances and calling methods
        Shark shark = new Shark();
        shark.eat();
        shark.breathe();
        shark.swim();

        Rohu rohu = new Rohu();
        rohu.eat();
        rohu.breathe();
        rohu.swim();

        Parrot parrot = new Parrot();
        parrot.eat();
        parrot.breathe();
        parrot.walk();

        Peacock peacock = new Peacock();
        peacock.eat();
        peacock.breathe();
        peacock.walk();

        Cat cat = new Cat();
        cat.eat();
        cat.breathe();
        cat.walk();

        Human human = new Human();
        human.eat();
        human.breathe();
        human.walk();
    }
}
