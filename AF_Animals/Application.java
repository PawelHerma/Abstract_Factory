package AF_Animals;

import AF_Animals.Animals.Animal;
import AF_Animals.Factories.AnimalFactory;

public class Application
{
    private Animal animal;

    public Application(AnimalFactory abstractFactory)
    {
        animal = abstractFactory.createAnimal();
    }
    public void eat()
    {
        animal.eat();
    }
    public void makeSound()
    {
        animal.makeSound();
    }
}
