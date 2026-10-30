package logger;

import java.text.SimpleDateFormat;

public class DefaultLogger extends AbstractLogger {
    public DefaultLogger(String name) {
        super(name);
    }

    private String formatMessage(String level, String message) {
        var dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", java.util.Locale.ENGLISH);
        dateFormat.setTimeZone(calendar.getTimeZone());

        return String.format(
                "[%s] <%s> %s - %s",
                level, dateFormat.format(calendar.getTime()), name, message
        );
    }

    public String debug(String message) {
        return formatMessage("DEBUG", message);
    }

    public String info(String message) {
        return formatMessage("INFO", message);
    }

    public String warning(String message) {
        return formatMessage("WARNING", message);
    }

    public String error(String message) {
        return formatMessage("ERROR", message);
    }

    public String toString() {
        return name + " — DefaultLogger";
    }
}