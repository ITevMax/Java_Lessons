package university.system;

public class Main {
    static void main() {
        var UrFU = new University("Уральский Федеральный Университет", "Екатеринбург");
        var MGU = new University("Московский Государственный Университет", "Москва");

        var InformaticsDepartment = new University.Department("Информатика");

        var Maxim = UrFU.new Student("Максим", "Айтиев", "Прикладная информатика");
        var Artur = UrFU.createStudent("Артур", "Иванов", "ИВТ");
        var Ivan = MGU.new Student("Иван", "Петров", "Психология");
        var Pyotr = UrFU.createSpecialStudent("Пётр", "Первый");

        System.out.println(UrFU);
        System.out.println();
        System.out.println(UrFU.getStudents());
        System.out.println();
        System.out.println(MGU);
        System.out.println(MGU.getStudents());
        System.out.println();
        System.out.println(InformaticsDepartment);
    }
}