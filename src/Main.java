public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Task 1");
        //writing kode for task 1
        String space = " ";
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + space + firstName +space+ middleName;

        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2() {
        System.out.println("TAsk 2");
        //writing kode for task 2
        String space = " ";
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName +space + firstName +space + middleName;
        String fullNameBig = fullName.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameBig);
    }

    public static void task3() {
        System.out.println("Task 3");
        //writing kode for task 3
        String space = " ";
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + space + firstName + space + middleName;

        if (fullName.contains("ё")) {
            String forbiddenChar = fullName.replace('ё', 'е');
            System.out.println("Данные ФИО сотрудника — " + forbiddenChar);
        } else {
            System.out.println("Данные ФИО сотрудника — " + fullName);
        }
    }
}