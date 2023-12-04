/*
Побудувати програму для роботи з класом Час. Програма повинна забезпечувати функції
збільшення/зменшення на 1 годину, хвилину, секунду, введення/виведення значень.
 */
public class ex7 implements ex7interface{
    /**
     * @version 2.5
     * This is hour
     */
    private int hour;
    private int minute;
    private int second;

    @Override
    public void increaseHour() {
        if(getHour() == 23) setHour(0);
        else setHour(getHour()+1);
    }

    @Override
    public void decreaseHour() {
        if(getHour() == 0) setHour(23);
        else setHour(getHour()-1);
    }

    @Override
    public void increaseMinute() {
        if(getMinute() == 59) {
            setMinute(0);
            increaseHour();
        }
        else setMinute(getMinute() + 1);
    }

    @Override
    public void decreaseMinute() {
        if(getMinute() == 0){
            setMinute(59);
            decreaseHour();
        }
        else setMinute(getMinute() - 1);
    }

    @Override
    public void increaseSecond() {
        if(getSecond() == 59){
            setSecond(0);
            increaseMinute();
        }
        else setSecond(getSecond() + 1);
    }

    @Override
    public void decreaseSecond() {
        if(getSecond() == 0){
            setSecond(59);
            decreaseMinute();
        }
        else setSecond(getSecond() - 1);
    }

    @Override
    public void displayTime() {
        System.out.println(getHour()+" hours "+getMinute()+ " minutes " + getSecond() + " seconds");
    }

    @Override
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
