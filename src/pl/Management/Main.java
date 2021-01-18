package pl.Management;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String lastName = scanner.nextLine();
        System.out.println("Podaj wiek");
        int age = scanner.nextInt();
        User user = new User(name, lastName, age);

        System.out.println(user);


    }
}
