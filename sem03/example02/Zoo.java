package sem03.example02;

import java.util.ArrayList;
import java.util.List;

class Zoo {
    private List<Animal> animals;

    Zoo() {
        animals = new ArrayList<>();
    }

    void addAnimal(Animal animal) {
        animals.add(animal);
    }

    void makeAllSounds() {
        for (Animal animal : animals) {
            try {
                animal.makeSound();
            } catch (HungryCatException e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Покормите кошку!");
            }
        }
    }
}