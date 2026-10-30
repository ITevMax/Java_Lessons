package logger;

import java.util.ArrayList;
import java.util.List;

public class LogManager {
    private final List<AbstractLogger> loggers = new ArrayList<>();

    public void addLogger(AbstractLogger logger) {
        loggers.add(logger);
    }

    public AbstractLogger getLogger(String name) {
        for (AbstractLogger logger : loggers) {
            if (logger.name.equals(name)) {
                return logger;
            }
        }

        var logger = new DefaultLogger(name);
        addLogger(logger);
        return logger;
    }

    public String printLoggers() {
        var result = new StringBuilder();

        for (AbstractLogger logger : loggers) {
            if (!result.isEmpty()) {
                result.append("\n");
            }

            result.append(logger.toString());
        }

        return result.toString();
    }
}