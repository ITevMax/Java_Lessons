package org.example;

import java.sql.ClientInfoStatus;

public class Main {
    static void main() {
        /*
        Client client = new Client();
        Contract contract = new Contract();
        Order order = new Order();


        Client client = new Client();
        client.setName("John Jones");
        client.setBirthDate(new LocalDate(2000, 6, 13));
        client.setAddres("Example City");
        Order[] orders = client.getOrders();
         */

        //Сокрытие реализации
        Order order = getOrder();
        order.paymentRecieved();
        order.sendToDelivery();
        order.cancel();


        Client client = new VIPClient();



    }
}

class Student {
    //Данные (состояние)
    String name;
    int course;
    double averageGrade;

    //Поведение (методы)
    void takeExam(String subject, int grade) {
        //Логика сдачи экзамена
    }

    double calculateAverage() {
        //Расчёт среднего балла
        return averageGrade;
    }
}


interface Matrix {
    double get(int i, int j);
    void set(int i, int j, double value);
    Matrix multiply(Matrix other);
}

class DenseMatrix implements Matrix {
    private double[][] data;
    //Реализация для обычной матрицы
}

class DiagonalMatrix implements Matrix {
    private double[][] diagonal;
    //Оптимизация под диагональную
}

//Использование - единый интерфейс!
Matrix m1 = new DenseMatrix(...);
Matrix m2 = new DiagonalMatrix(...);
Matrix result = m1.multiply(m2); //С любым типом


/*
import ru.urfu.java.other;
import java.util.*;

//Пакеты
java.lang
java.io
java.nio
java.math
java.time
java.util
java.util.regex
javax.xml

ru.urfu.java
com.google.common
org.apache.maven
com.intellij.idea
net.sf.json
io.netty
 */