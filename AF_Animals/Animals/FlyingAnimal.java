package AF_Animals.Animals;

public class FlyingAnimal implements Animal
{

    @Override
    public void eat() 
    {
        System.out.println("I eat worms, fish or flesh depending on how big I am");
    }

    @Override
    public void makeSound() 
    {
        System.out.println("I can whistle, squeak and even high-pitched screech");
    }
    
}
