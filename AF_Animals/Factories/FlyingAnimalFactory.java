package AF_Animals.Factories;

import AF_Animals.Animals.Animal;
import AF_Animals.Animals.FlyingAnimal;

public class FlyingAnimalFactory implements AnimalFactory
{

    @Override
    public Animal createAnimal() 
    {
        return new FlyingAnimal();
    }
    
}
