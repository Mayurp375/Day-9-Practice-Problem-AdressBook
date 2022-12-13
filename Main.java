package classProblemByAmolMateSir.Day9.addressBook;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to address Book");

        AdressBook adressBook = new AdressBook();
        adressBook.setFirstName("mayur");
        adressBook.lastName = "polojwar";
        adressBook.address = "cha";
        adressBook.city = "mo";
        adressBook.state = "mh";
        adressBook.adress = new Address();
        adressBook.adress.setPhoneNumber(78556662l);
        adressBook.adress.setZip(440045);
        System.out.println(adressBook);
    }
}
