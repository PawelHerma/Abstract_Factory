using System;
class BmwFactory : IAbstractFactory
{
    public IAbstractCar CreateCar()
    {
        return new BmwCar();
    }
    public IAbstractMotorcycle CreateMotorcycle()
    {
        return new BmwMotorcycle();
    }
}