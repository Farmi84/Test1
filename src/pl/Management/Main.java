package pl.Management;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void calculator() {
        System.out.println("Podaj pierwszą liczbę");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();
        System.out.println("a + b = " + Calculator.add(a, b));
        System.out.println("a - b = " + Calculator.subtract(a, b));
        System.out.println("a * b = " + Calculator.multiply(a, b));
        System.out.println("a / b = " + Calculator.divide(a, b));
    }

    public static void createUser() {

        System.out.println("Podaj imię: ");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String lastName = scanner.nextLine();
        System.out.println("Podaj wiek");
        int age = scanner.nextInt();
        User user = new User(name, lastName, age);

        System.out.println(user);
    }

    public static void main(String[] args) {

        createUser();
        calculator();


    }


}
