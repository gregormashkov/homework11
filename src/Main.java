public class Main {
    public static void main(String[] args) {
        // Задание 1.
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov" + "Ivan" + "Ivanovich";
        System.out.println("ФИО сотрудника " + fullName);
    }
    // Задание 2.
    String fullName = "Ivanov" + "Ivan" + "Ivanovich";
    String fullName1 = fullName.toUpperCase();
    System.out.println(fullName1);

    // Задание 3.
    String fullName2 = "Иванов" + "Сем"+ "ё" + "н" + "Сем" +"ё" + "н" + "ович";
    String value = "Иванов" + "Сем"+ "ё" + "н" + "Сем" +"ё" + "н" + "ович".replace('ё', 'е');
    System.out.println(value);




    }
