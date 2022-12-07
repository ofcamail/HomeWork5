import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        part1Task1();
        part1Task2();
        part1Task3();
        part2Task1();
        part2Task2();
        part2Task3();
        part2Task4();


    }

    public static void part1Task1() {
        System.out.println("Part 1 Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void part1Task2() {
        System.out.println("Part 1 Task 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName.toUpperCase());
    }

    public static void part1Task3() {
        System.out.println("Part 1 Task 3");
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.replace('ё', 'е');
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void part2Task1() {
        System.out.println("Part 2 Task 1");
        Scanner name1 = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = name1.next();
        {
            System.out.println("Hello, " + name + "!");
        }
    }

    public static void part2Task2() {
        System.out.println("Part 2 Task 2");
        Scanner temperature = new Scanner(System.in);
        System.out.println("Enter the temperature");
        int t = temperature.nextInt();
        {
            System.out.println("Температура воздуха сегодня: " + t + " градусов");
        }
    }

    public static void part2Task3() {
        System.out.println("Part 2 Task 3");
        Scanner day = new Scanner(System.in);
        System.out.println("Enter the day in the format DD");
        int dd = day.nextInt();
        Scanner month = new Scanner(System.in);
        System.out.println("Enter the month in the format MM");
        int mm = month.nextInt();
        Scanner year = new Scanner(System.in);
        System.out.println("Enter the year in the format YYYY");
        int yyyy = year.nextInt();
        String ddmmyyyy = String.valueOf(dd +"." + mm +"." + yyyy);
        System.out.println(ddmmyyyy);
    }
    public static void part2Task4(){
    Scanner name1 = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = name1.nextLine();
    Scanner name2 = new Scanner(System.in);
    System.out.println("Enter the name of your assistant");
    String assistName = name2.nextLine();
    Scanner numberOfLetters = new Scanner(System.in);
    System.out.println("Enter the number of letters");
    int numberOfLet = numberOfLetters.nextInt();
    String output = "Привет, " + name + "! " + "Это твой помощник " + assistName + ". \n" + "У тебя " + numberOfLet + " новых писем.";
    System.out.println (output);
    }
}