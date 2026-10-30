package logger;

import java.util.Calendar;
import java.util.TimeZone;

public abstract class AbstractLogger {
    protected Calendar calendar;
    protected String name;

    public AbstractLogger(String name) {
        this.name = name;
        this.calendar = Calendar.getInstance();
    }

    public abstract String debug(String message);

    public abstract String info(String message);

    public abstract String warning(String message);

    public abstract String error(String message);

    public abstract String toString();

    public void setCalendar(TimeZone timeZone, int year, int month, int day, int hours, int minutes, int seconds) {
        calendar = Calendar.getInstance(timeZone);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hours);
        calendar.set(Calendar.MINUTE, minutes);
        calendar.set(Calendar.SECOND, seconds);
    }
}