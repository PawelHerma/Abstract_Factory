using System;
class BmwMotorcycle : IAbstractMotorcycle
{
    public string EngineSound()
    {
        return "Motocykl BMW robi Prutututu";
    }
    public string Company(IAbstractCar friend)
    {
        var company = friend.EngineSound();
        return $"({this.EngineSound()} a ({company}))";
    }
}