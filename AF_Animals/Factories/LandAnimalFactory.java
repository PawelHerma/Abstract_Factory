package AF_Animals.Factories;

import AF_Animals.Animals.Animal;
import AF_Animals.Animals.LandAnimal;

public class LandAnimalFactory implements AnimalFactory
{

    @Override
    public Animal createAnimal() 
    {
        return new LandAnimal();
    }
    
}
