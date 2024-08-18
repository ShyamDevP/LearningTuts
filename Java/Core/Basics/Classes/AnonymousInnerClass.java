public class AnonymousInnerClass {
    public static void main(String[] args) {
        // Anonymous inner class extending the Animal class
        Animal myAnimal = new Animal() {
            @Override
            void makeSound() {
                System.out.println("Meow!");
            }
        };

        // Using the instance of the anonymous inner class
        myAnimal.makeSound();
    }
}
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}


