public class Car implements Vehicle, Alarm {
    private String brand;
    
    public Car(String brand) 
    {
        this.brand = brand;
    }
    
    public String getBrand()
    {
        return brand;
    }
    
    public String speedUp() 
    {
        return "The car is speeding up.";
    }
    
    public String slowDown() 
    {
        return "The car is slowing down.";
    }
    
    // Risoluzione del conflitto dei metodi default
    public String turnAlarmOn() 
    {
        return Vehicle.super.turnAlarmOn() + " " + Alarm.super.turnAlarmOn();
    }
    
    public String turnAlarmOff() 
    {
        return Vehicle.super.turnAlarmOff() + " " + Alarm.super.turnAlarmOff();
    }
}