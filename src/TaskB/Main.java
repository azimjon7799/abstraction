package TaskB;
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Bow bow", "Rex");
        Animal duck = new Duck("Quack quack", "Donald");
        Animal cat = new Cat("Meow meow", "Tom");

        System.out.println("I am a dog!\nMy name is " + dog.getName() + " and My sound: " + dog.sound());
        System.out.println("I am a duck!\nMy name is " + duck.getName() + " and My sound: " + duck.sound());
        System.out.println("I am a cat!\nMy name is " + cat.getName() + " and My sound: " + cat.sound());
    }
}