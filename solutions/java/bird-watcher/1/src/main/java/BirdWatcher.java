
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] =
            birdsPerDay[birdsPerDay.length - 1] + 1; 
    }

    public boolean hasDayWithoutBirds() {
        int dayWithoutBird = 0;

        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0) {
                dayWithoutBird++;
            }
        }

        return (dayWithoutBird > 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        int minimum = Math.min(birdsPerDay.length, numberOfDays);

        for (int i = 0; i < minimum; i++) {
            count = count + birdsPerDay[i];
        }

        return count;
    }

    public int getBusyDays() {
        int busyDay = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                busyDay++;
            }
        }

        return busyDay;
    }
}
