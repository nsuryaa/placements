import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    
    //Animal animal = new Animal("Animal","Big","100");
    Dog dog = new Dog("Wolf", "Big", 100);
    dog.makenoise();
    doAnimalStuff(dog);
    ArrayList<Animal> animals = new ArrayList<>();
    animals.add(dog);
    animals.add(new Dog("Labrador","Big",150));
    animals.add(new Dog("Rosie","Cute",150));
    animals.add(new Fish("Keluthi","100",100));

    animals.add(new Horse("Summa", "Large", 1000));

    for(Animal animal:animals)
    {
     
      doAnimalStuff(animal);
      //  if(animal instanceof Mammal currentMammal)
      // {
      //   currentMammal.shedHair();
      //   animal.shedHair();
      // }
    }

  }
  private static void doAnimalStuff(Animal animal)
  {
    animal.makenoise();
    animal.move("Slow");
  }
}
