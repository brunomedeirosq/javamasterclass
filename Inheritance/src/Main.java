public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever",65,"Floppy","Swimmer");
        doAnimalStuff(retriever,"slow");

        Dog wolf = new Dog("wolf", 40);
        doAnimalStuff(wolf,"slow");

        Fish fish = new Fish("goldfish",0.25,2,3);
        doAnimalStuff(fish,"fast");

    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_____");
    }


}
