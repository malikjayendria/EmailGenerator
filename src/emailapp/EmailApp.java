package emailapp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname, lastname;
        System.out.print("input First Name: ");
        firstname = scanner.next();
        System.out.print("input Last Name: ");
        lastname = scanner.next();

        Email em1 = new Email(firstname, lastname);

        System.out.println(em1.showInfo());
    }
}
