public class JedliksToyCar {
    private int distance = 0;
    private int battery = 100;
    
    public static JedliksToyCar buy() {
        JedliksToyCar toyCar = new JedliksToyCar();
        return toyCar;
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
        if (battery != 0)
        {
            distance = distance + 20;
            battery = battery - 1;
        }
    }
}
