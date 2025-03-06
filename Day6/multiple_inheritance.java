package Day6;
class Animal {
    void sound() {
        System.out.println("Animals make different sounds.");
    }
}

class Pet {
    void category() {
        System.out.println("This is a pet animal.");
    }
}

class Dog {
    private Animal animal = new Animal();
    private Pet pet = new Pet();

    void breed() {
        System.out.println("This is a Golden Retriever.");
    }

    void sound() {
        animal.sound();
    }

    void category() {
        pet.category();
    }
}

public class multiple_inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.category();
        dog.breed();
    }
}