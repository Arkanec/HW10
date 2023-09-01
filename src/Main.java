public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника = " + fullName);

        System.out.println();

        System.out.println("Задача 2");
        String small = fullName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + small.toUpperCase());

        System.out.println();

        System.out.println("Задача 3");
        String firstName2 = "Семён";
        String middleName2 = "Семёнович";
        String lastName2 = "Иванов";
        middleName2 = middleName2.replace("ё", "е");
        firstName2 = firstName2.replace("ё", "е");
        String fullName2 = lastName2 + " " + firstName2 + " " + middleName2;
        System.out.println("Данные ФИО сотрудника — " + fullName2);
    }
}