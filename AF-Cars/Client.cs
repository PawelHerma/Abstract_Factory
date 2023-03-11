using System;
class Client
{
    public void ClientMethod(IAbstractFactory factory)
    {
        var car = factory.CreateCar();
        var motorcycle = factory.CreateMotorcycle();

        Console.WriteLine(motorcycle.Company(car));
    }
    public void Main()
    {
        Console.WriteLine("Tworzymy nowa ekipe Suzuki");
        ClientMethod(new SuzukiFactory());
        Console.WriteLine();

        Console.WriteLine("Tworzymy nowa ekipe BMW");
        ClientMethod(new BmwFactory());
        Console.WriteLine();
    }
}