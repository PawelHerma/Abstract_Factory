using System;
class SuzukiMotorcycle : IAbstractMotorcycle
{
    public string EngineSound()
    {
        return "Motocykl Suzuki robi Gratatata";
    }
    public string Company(IAbstractCar friend)
    {
        var company = friend.EngineSound();
        return $"({this.EngineSound()} a ({company}))";
    }
}