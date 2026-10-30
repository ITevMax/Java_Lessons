package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //TODO напишите консольное приложение для работы с классом больница,
        // учитывая, что сгенерированные и вычисленные переменные,
        // нельзя будет менять.
        var firstHospital = new Hospital(10);
        System.out.println(firstHospital.getReport());
    }
}

public class Hospital {
    private int patientsCount;
    private float[] patientsTemperatures;
    private int countOfHealthy;
    private String stringOfTemperature;
    private double averageTemp;
    private String report;

    public Hospital(int patientsCount) {
        //TODO создание больницы с указанным кол-вом пациентов
        // если значение не верное, бросать IllegalArgumentException с помощью метода
        // throw new <Exception.class>
        if (patientsCount <= 0) throw new IllegalArgumentException();
        this.patientsCount = patientsCount;
    }

    //нужно кол-во пациентов
    public float[] generatePatientsTemperatures() {
        //TODO реализовать генерацию массива температур от 32 до 40 градусов
        if (patientsTemperatures == null) {
            var random = new Random();
            var patientsTemperatures = new float[patientsCount];
            for (var i = 0; i < patientsCount; i++) {
                patientsTemperatures[i] = random.nextFloat() + (random.nextInt(8) + 32);
            }
            this.patientsTemperatures = patientsTemperatures;
            return patientsTemperatures;
        }
        else {
            return patientsTemperatures;
        }
    }

    //нужна генерация температур
    public int getCountHealthy() {
        //TODO реализовать подсчёт кол-ва здоровых(36,2 < x < 36,9) в сгенерированном
        // массиве температур, если метод уже был вызван ранее, не выполнять подсчет снова,
        // а возращать текущее вычисленное значение
        // если генерация температур не была выполнена, вызвать метод генерации
        if (countOfHealthy == 0) {
            if (patientsTemperatures == null)
                generatePatientsTemperatures();

            var countOfHealthy = 0;
            for (var temperature : patientsTemperatures) {
                if (36.2 < temperature && temperature < 36.9) countOfHealthy++;
            }

            this.countOfHealthy = countOfHealthy;
        }

        return this.countOfHealthy;
    }

    //нужна генерация температур
    public String getTemperaturesToString() {
        //TODO реализовать получение массива температур в виде строки<double>, <double>, <double>
        // если метод уже был вызван ранее, не выполнять подсчет снова,
        // а возращать текущее вычисленное значение
        // если генерация температур не была выполнена, вызвать метод генерации

        if (stringOfTemperature == null) {
            if (patientsTemperatures == null)
                generatePatientsTemperatures();

            var stringOfTemperature = "";
            for (var temperature : patientsTemperatures) {
                stringOfTemperature = stringOfTemperature
                        .concat(Math.round(temperature * 10.0) / 10.0 + " ")
                        .replace(".", ",");
            }
            stringOfTemperature = stringOfTemperature.substring(0, stringOfTemperature.length() - 1);
            this.stringOfTemperature = stringOfTemperature;
        }

        return this.stringOfTemperature;
    }

    //Нужна генерация температур
    public double getAverageTemp() {
        //TODO реализовать получение средней температуры из массива
        // если метод уже был вызван ранее, не выполнять подсчет снова,
        // а возращать текущее вычисленное значение
        // если генерация температур не была выполнена, вызвать метод генерации

        if (averageTemp == 0) {
            if (patientsTemperatures == null)
                generatePatientsTemperatures();

            var sum = 0d;
            for (var temperature : patientsTemperatures) {
                sum += temperature;
            }

            var averageTemp = (Math.round(sum * 100.0) / 100.0) / patientsCount;
            this.averageTemp = averageTemp;
        }

        return this.averageTemp;
    }


    //нужны температуры, средняя температура и кол-во здоровых
    public String getReport() {
        //TODO реализовать получение отчёта в формате приложенном ниже
        // если метод уже был вызван ранее, не выполнять подсчет снова,
        // а возращать текущее вычисленное значение
        // если все необходимые переменные не были получены ранее,
        // вызвать все методы необходимые для получения отчёта
        /*TODO Формат вывода:
           Температуры пациентов: 37,5 36,9 38,2 33,5 32,2
           Средняя температура: 35,67
           Количество здоровых: 1
         */

        if (report == null) {
            if (countOfHealthy == 0) getCountHealthy();
            if (averageTemp == 0) getAverageTemp();
            if (stringOfTemperature == null) getTemperaturesToString();
            var report = String.format(
                    "Температуры пациентов: %s\n" +
                    "Средняя температура: %.2f\n" +
                    "Количество здоровых: %d",
                    stringOfTemperature, averageTemp, countOfHealthy)
                    .replace(".", ",");
            this.report = report;
        }
        return this.report;
    }
}