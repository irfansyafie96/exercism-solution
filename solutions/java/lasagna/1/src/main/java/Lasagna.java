public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutes) {
        return 40 - minutes;
    }

    public int preparationTimeInMinutes(int layer) {
        return layer * 2;
    }

    public int totalTimeInMinutes(int layer, int minutes) {
        return (layer * 2) + minutes;
    }
}
