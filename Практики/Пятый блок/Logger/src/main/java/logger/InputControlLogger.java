package logger;

import java.text.SimpleDateFormat;

public class InputControlLogger extends AbstractLogger {
    public InputControlLogger(String name) {
        super(name);
    }

    private String formatMessage(String level, String description, String message) {
        var dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", java.util.Locale.ENGLISH);
        dateFormat.setTimeZone(calendar.getTimeZone());

        return String.format(
                "[%s] <%s> %s - %s",
                level, dateFormat.format(calendar.getTime()), description, message
        );
    }

    public String info(String message) {
        return formatMessage("INFO", "Вход пользователя", message);
    }

    public String debug(String message) {
        return formatMessage("DEBUG", "Обнаружен пользователь", message);
    }

    public String error(String message) {
        return formatMessage("ERROR", "Не удалось найти данные пользователя", message);
    }

    public String warning(String message) {
        return formatMessage("WARNING", "Обнаружен неавторизованный доступ в систему", message);
    }

    public String toString() {
        return name + " - InputControlLogger";
    }
}