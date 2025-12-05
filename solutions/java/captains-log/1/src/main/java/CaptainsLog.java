import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};
    public static final int MIN_REGISTRY_NUMBER = 1000;
    public static final int MAX_REGISTRY_NUMBER = 9999;
    public static final double START_DATE = 41000.0;
    public static final double FINAL_DATE = 42000.0;

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int rand = this.random.nextInt(PLANET_CLASSES.length);
        return PLANET_CLASSES[rand];
    }

    String randomShipRegistryNumber() {
        int range = MAX_REGISTRY_NUMBER - MIN_REGISTRY_NUMBER + 1;
        int number = MIN_REGISTRY_NUMBER + this.random.nextInt(range);
        return "NCC-" + number;
    }

    double randomStardate() {
        double range = FINAL_DATE - START_DATE;
        return START_DATE + (this.random.nextDouble() * range);
    }
}
