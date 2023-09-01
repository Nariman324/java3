/*
 * Задача: Работа с животными
Представьте, что у вас есть простое приложение для управления списком животных. 
Вам нужно реализовать классы для добавления, удаления и вывода информации о животных. 
Также нужно предусмотреть обработку исключений в случае ошибок.
В этом примере используются следующие концепции исключений:
- Создание собственного исключения AnimalNotFoundException.
- Обработка исключения на низком уровне (в методе removeAnimal класса AnimalList).
- Обработка исключения на высоком уровне (в методе main класса AnimalApp).
*/

package sem03.example03;

public class AnimalsApp {
    public static void main(String[] args) {

        Animal cat = new Animal("cat");
        Animal dog = new Animal("dog");
        Animal bird = new Animal("bird");
        Animal snake = new Animal("snake");

        AnimalList list = new AnimalList();

        list.addAnimal(cat, dog, bird, snake);

        list.printAnimals();

        try {
            list.removeAnimal(0);
        } catch (AnimalNotFoundException e) {
            System.out.println(e.getMessage());
        }
        list.printAnimals();

        try {
            list.removeAnimal(5);
        } catch (AnimalNotFoundException e) {
            System.out.println(e.getMessage());
        }
        list.printAnimals();

        try {
            list.removeAnimal(0);
        } catch (AnimalNotFoundException e) {
            System.out.println(e.getMessage());
        }
        list.printAnimals();

        try {
            list.removeAnimal(bird);
        } catch (AnimalNotFoundException e) {
            System.out.println(e.getMessage());
        }
        list.printAnimals();

        try {
            list.removeAnimal(bird);
        } catch (AnimalNotFoundException e) {
            System.out.println(e.getMessage());
        }
        list.printAnimals();
    }
}