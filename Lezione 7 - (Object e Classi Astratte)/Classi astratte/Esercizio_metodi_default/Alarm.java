public interface Alarm 
{
    default String turnAlarmOn() 
    {
        return "Turned the alarm on.";
    }

    default String turnAlarmOff() 
    {
        return "Turned the alarm off.";
    }
}