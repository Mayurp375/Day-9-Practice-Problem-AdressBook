package classProblemByAmolMateSir.Day9.addressBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to address Book");
        Scanner scanner = new Scanner(System.in);
        AdressBook adressBook = new AdressBook(); //object is crated of class

        System.out.println("enter first name");
        adressBook.firstName = scanner.next();

        System.out.println("enter last name");
        adressBook.lastName = scanner.next();

        System.out.println("enter address name");
        adressBook.address = scanner.next();

        System.out.println("enter city name");
        adressBook.city = scanner.next();

        System.out.println("enter state name");
        adressBook.state = scanner.next();


        adressBook.adress = new Address(); //class object assined

        System.out.println("enter PhoneNumber name");
        adressBook.adress.setPhoneNumber(scanner.nextLong());

        System.out.println("enter Zip name");
        adressBook.adress.setZip(scanner.nextInt());

        System.out.println(adressBook);
    }
}
