package AF_Animals.Animals;

public class LandAnimal implements Animal 
{

    @Override
    public void eat() 
    {
        System.out.println("I'm eating what a land animal eats");
    }

    @Override
    public void makeSound() 
    {
        System.out.println("I can usually make a loud sound like roar or meow");
    }
    
}
