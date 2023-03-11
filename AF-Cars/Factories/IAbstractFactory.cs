using System;
public interface IAbstractFactory
{
    IAbstractCar CreateCar();
    IAbstractMotorcycle CreateMotorcycle();
}