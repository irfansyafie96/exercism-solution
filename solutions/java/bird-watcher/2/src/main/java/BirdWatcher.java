
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
        for (int birds : birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }

        return false;
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
        int busyDayCount = 0;

        for (int birds : birdsPerDay) {
            if (birds >= 5) busyDayCount++;
        }
        return busyDayCount;
    }
}
