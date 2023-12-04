/*
Побудувати програму для роботи з класом Час. Програма повинна забезпечувати функції
збільшення/зменшення на 1 годину, хвилину, секунду, введення/виведення значень.
 */
/**
 * Клас, що представляє час у годинах, хвилинах і секундах.
 */
public class ex7 implements ex7interface {

    /** Години */
    private int hour;
    /** Хвилини */
    private int minute;
    /** Секунди */
    private int second;

    /**
     * Збільшує годину на 1.
     */
    @Override
    public void increaseHour() {
        if (getHour() == 23) setHour(0);
        else setHour(getHour() + 1);
    }

    /**
     * Зменшує годину на 1.
     */
    @Override
    public void decreaseHour() {
        if (getHour() == 0) setHour(23);
        else setHour(getHour() - 1);
    }

    /**
     * Збільшує хвилини на 1.
     */
    @Override
    public void increaseMinute() {
        if (getMinute() == 59) {
            setMinute(0);
            increaseHour();
        } else setMinute(getMinute() + 1);
    }

    /**
     * Зменшує хвилини на 1.
     */
    @Override
    public void decreaseMinute() {
        if (getMinute() == 0) {
            setMinute(59);
            decreaseHour();
        } else setMinute(getMinute() - 1);
    }

    /**
     * Збільшує секунди на 1.
     */
    @Override
    public void increaseSecond() {
        if (getSecond() == 59) {
            setSecond(0);
            increaseMinute();
        } else setSecond(getSecond() + 1);
    }

    /**
     * Зменшує секунди на 1.
     */
    @Override
    public void decreaseSecond() {
        if (getSecond() == 0) {
            setSecond(59);
            decreaseMinute();
        } else setSecond(getSecond() - 1);
    }

    /**
     * Виводить значення годин, хвилин і секунд у консоль.
     */
    @Override
    public void displayTime() {
        System.out.println(getHour() + " hours " + getMinute() + " minutes " + getSecond() + " seconds");
    }

    /**
     * Встановлює години, хвилини і секунди.
     *
     * @param hour   години
     * @param minute хвилини
     * @param second секунди
     */
    @Override
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /**
     * Повертає години.
     *
     * @return години
     */
    public int getHour() {
        return hour;
    }

    /**
     * Встановлює години.
     *
     * @param hour години
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * Повертає хвилини.
     *
     * @return хвилини
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Встановлює хвилини.
     *
     * @param minute хвилини
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }

    /**
     * Повертає секунди.
     *
     * @return секунди
     */
    public int getSecond() {
        return second;
    }

    /**
     * Встановлює секунди.
     *
     * @param second секунди
     */
    public void setSecond(int second) {
        this.second = second;
    }

}
