public class CarsAssemble {
    private static final int CAR_PRODUCED_PER_HOUR = 221;
    private static final int MINUTES_IN_A_HOUR = 60;

    public double productionRatePerHour(int speed) {
        if (speed <= 4)
        {
            return speed * CAR_PRODUCED_PER_HOUR;
        }
        else if (speed >= 5 && speed <= 8)
        {
            return speed * 0.9 * CAR_PRODUCED_PER_HOUR;
        }
        else if (speed == 9)
        {
            return speed * 0.8 * CAR_PRODUCED_PER_HOUR;
        }
        else if (speed == 10)
        {
            return speed * 0.77 * CAR_PRODUCED_PER_HOUR;
        } else
        {
            return speed;
        }
    }

    public int workingItemsPerMinute(int speed) {
        int result = (int) productionRatePerHour(speed);
        return result / MINUTES_IN_A_HOUR;
    }
}
