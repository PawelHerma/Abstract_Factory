package AF_Animals.Animals;

public class WaterAnimal implements Animal
{

    @Override
    public void eat() 
    {
        System.out.println("We basicly eat each other :)");
    }

    @Override
    public void makeSound() 
    {
        System.out.println("...");
    }
    
}
