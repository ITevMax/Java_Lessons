package org.example;

public class Main {
    static void main() {
        var PeaceAndWar = new Book("Война и мир", "Толстой Л. Н.", 1869);
        var CrimeAndPunishment = new Book("Преступление и наказание", "Достоевский Ф. М.", 1866);
        var AHeroOfOurTime = new Book("Герой нашего времени", "Лермонтов М. Ю.", 1840);

        PeaceAndWar.displayInfo();
        CrimeAndPunishment.displayInfo();
        CrimeAndPunishment.markAsRead();
        CrimeAndPunishment.displayInfo();
    }
}
