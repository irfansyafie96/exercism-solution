public class JedliksToyCar {
    private static final int DRIVE_DISTANCE = 20;
    private static final int BATTERY_USED = 1; 
    private int distance = 0;
    private int battery = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if (battery > 0)
        {
            return "Battery at " + battery + "%";
        } else
        {
            return "Battery empty";
        }
    }

    public void drive() {
        if (battery > 0)
        {
            distance = distance + DRIVE_DISTANCE;
            battery = battery - BATTERY_USED;
        }
    }
}
