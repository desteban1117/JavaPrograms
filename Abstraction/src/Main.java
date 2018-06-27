public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("niko");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Autralian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Pinguin pinguin = new Pinguin("Emperor");
        pinguin.fly();
    }
}
