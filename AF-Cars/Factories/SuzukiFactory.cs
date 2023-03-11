using System;

class SuzukiFactory : IAbstractFactory
{
    public IAbstractCar CreateCar()
    {
        return new SuzukiCar();
    }
    public IAbstractMotorcycle CreateMotorcycle()
    {
        return new SuzukiMotorcycle();
    }
}