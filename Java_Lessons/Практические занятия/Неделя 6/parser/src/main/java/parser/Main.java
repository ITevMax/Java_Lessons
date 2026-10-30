package parser;

import static parser.DataParser.parseData;

public class Main {
    static void main() {
        Object[] testData = {
                "123.45", 42, null, "abc", true
        };
        for (Object data : testData) {
            try {
                Number result = parseData(data);
                System.out.println("Результат: " + result);

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: строку невозможно преобразовать в число.");

            } catch (NullPointerException e) {
                System.out.println("Ошибка: передано значение null.");

            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: неподдерживаемый тип данных.");
            }
        }
    }
}