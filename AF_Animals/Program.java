package AF_Animals;

import java.util.Scanner;

import AF_Animals.Factories.AnimalFactory;
import AF_Animals.Factories.FlyingAnimalFactory;
import AF_Animals.Factories.LandAnimalFactory;
import AF_Animals.Factories.WaterAnimalFactory;

public class Program 
{
    private static Application configureApplication(String input)
    {
        Application app;
        AnimalFactory factory = new LandAnimalFactory();
        String type = input.toLowerCase();
        switch (type)
        {
            case "wand":
            {
                factory = new LandAnimalFactory();
                break;
            }
            case "water":
            {
                factory = new WaterAnimalFactory();
                break;
            }
            case "flying":
            {
                factory = new FlyingAnimalFactory();
                break;
            }
        }
        app = new Application(factory);
        return app;
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Set animal type: ");
        String type = input.next();
        Application app = configureApplication(type);
        app.eat();
        app.makeSound();
        input.close();
    }
}
