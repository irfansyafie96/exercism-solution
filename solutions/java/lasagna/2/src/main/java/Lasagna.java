public class Lasagna {
    private static final int EXPECTED_MINUTES_IN_OVEN = 40;
    private static final int TIME_PER_LAYER = 2;
    
    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int minutes) {
        return EXPECTED_MINUTES_IN_OVEN - minutes;
    }

    public int preparationTimeInMinutes(int layer) {
        return layer * TIME_PER_LAYER;
    }

    public int totalTimeInMinutes(int layer, int minutes) {
        return (layer * TIME_PER_LAYER) + minutes;
    }
}
