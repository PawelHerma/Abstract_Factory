package AF_Animals.Factories;

import AF_Animals.Animals.Animal;
import AF_Animals.Animals.WaterAnimal;

public class WaterAnimalFactory implements AnimalFactory
{

    @Override
    public Animal createAnimal() 
    {
        return new WaterAnimal();
    }
    
}
