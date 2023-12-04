/**
 * A class representing time in hours, minutes, and seconds.
 */
public class ex7 implements ex7interface {

    /** Hours */
    private int hour;
    /** Minutes */
    private int minute;
    /** Seconds */
    private int second;

    /**
     * Increases the hour by 1.
     */
    @Override
    public void increaseHour() {
        if (getHour() == 23) setHour(0);
        else setHour(getHour() + 1);
    }

    /**
     * Decreases the hour by 1.
     */
    @Override
    public void decreaseHour() {
        if (getHour() == 0) setHour(23);
        else setHour(getHour() - 1);
    }

    /**
     * Increases the minutes by 1.
     */
    @Override
    public void increaseMinute() {
        if (getMinute() == 59) {
            setMinute(0);
            increaseHour();
        } else setMinute(getMinute() + 1);
    }

    /**
     * Decreases the minutes by 1.
     */
    @Override
    public void decreaseMinute() {
        if (getMinute() == 0) {
            setMinute(59);
            decreaseHour();
        } else setMinute(getMinute() - 1);
    }

    /**
     * Increases the seconds by 1.
     */
    @Override
    public void increaseSecond() {
        if (getSecond() == 59) {
            setSecond(0);
            increaseMinute();
        } else setSecond(getSecond() + 1);
    }

    /**
     * Decreases the seconds by 1.
     */
    @Override
    public void decreaseSecond() {
        if (getSecond() == 0) {
            setSecond(59);
            decreaseMinute();
        } else setSecond(getSecond() - 1);
    }

    /**
     * Displays the values of hours, minutes, and seconds in the console.
     */
    @Override
    public void displayTime() {
        System.out.println(getHour() + " hours " + getMinute() + " minutes " + getSecond() + " seconds");
    }

    /**
     * Sets the hours, minutes, and seconds.
     *
     * @param hour   hours
     * @param minute minutes
     * @param second seconds
     */
    @Override
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /**
     * Gets the hours.
     *
     * @return hours
     */
    public int getHour() {
        return hour;
    }

    /**
     * Sets the hours.
     *
     * @param hour hours
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * Gets the minutes.
     *
     * @return minutes
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Sets the minutes.
     *
     * @param minute minutes
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }

    /**
     * Gets the seconds.
     *
     * @return seconds
     */
    public int getSecond() {
        return second;
    }

    /**
     * Sets the seconds.
     *
     * @param second seconds
     */
    public void setSecond(int second) {
        this.second = second;
    }
}
