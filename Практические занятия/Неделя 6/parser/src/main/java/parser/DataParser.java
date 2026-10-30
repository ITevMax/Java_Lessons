package parser;

public class DataParser {
    public static Number parseData(Object data) {
        return switch (data) {
            case null -> throw new NullPointerException("Данные не должны быть null");
            case String s -> Double.parseDouble(s);
            case Number number -> number;
            default -> throw new IllegalArgumentException("Неподдерживаемый тип данных");
        };
    }
}