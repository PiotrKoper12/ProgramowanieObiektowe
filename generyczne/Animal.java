// Klasa bazowa Animal
class Animal {
    private int age;  // Wiek zwierzęcia

    // Konstruktor
    public Animal(int age) {
        this.age = age;
    }

    // Getter dla wieku
    public int getAge() {
        return age;
    }

    // Nadpisujemy metodę toString, aby wygodnie wyświetlać informacje o zwierzęciu
    @Override
    public String toString() {
        return "Animal [age=" + age + "]";
    }
}

// Klasa Dog, która dziedziczy po Animal
class Dog extends Animal {
    private String breed;  // Rasa psa

    // Konstruktor
    public Dog(int age, String breed) {
        super(age);  // Wywołanie konstruktora klasy bazowej (Animal)
        this.breed = breed;
    }

    // Getter dla rasy
    public String getBreed() {
        return breed;
    }

    // Nadpisujemy metodę toString, aby wygodnie wyświetlać informacje o psie
    @Override
    public String toString() {
        return "Dog [age=" + getAge() + ", breed=" + breed + "]";
    }
}

// Klasa z metodą generyczną findMax
public class Main {

    // Generyczna statyczna metoda porównująca dwa elementy typu extends Animal
    public static <T extends Animal> T findMax(T element1, T element2) {
        // Porównujemy elementy po wieku
        if (element1.getAge() > element2.getAge()) {
            return element1;
        } else {
            return element2;
        }
    }

    public static void main(String[] args) {
        // Tworzymy obiekty Animal i Dog
        Animal animal = new Animal(5);
        Dog dog = new Dog(3, "Golden Retriever");

        // Wywołujemy metodę findMax dla obiektów typu Animal i Dog
        Animal olderAnimal = findMax(animal, dog);

        // Wyświetlamy wynik
        System.out.println("Starsze zwierzę: " + olderAnimal);
    }
}
