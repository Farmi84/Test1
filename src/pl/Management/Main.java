package pl.Management;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

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
    }
}
