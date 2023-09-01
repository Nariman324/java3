package sem03.example02;

public class ZooApp {
    public static void main(String[] args) throws HungryCatException {
        Zoo zoo = new Zoo();

        Animal cat = new Cat(true); // Создаем голодную кошку
        Animal dog = new Dog();

        zoo.addAnimal(cat);
        zoo.addAnimal(dog);

        zoo.makeAllSounds();
    }
}
