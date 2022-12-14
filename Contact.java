package classProblemByAmolMateSir.Day9.addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact implements Comparable<Contact> {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String email;
    int zip;
    long phoneNumber;

    public Contact(String firstName, String lastName, String address, String city, String state, String email, int zip, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Contact o) {
        if (this.firstName.equals(o.firstName) && (this.lastName.equals(o.lastName)) && (this.address == o.address) && this.city == o.city && this.state == o.state && this.email == o.email && this.zip == o.zip && this.phoneNumber == o.phoneNumber) {
            return 1;
        } else {
            return -1;
        }

    }


    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        Contact contactOne = new Contact("Mayur", "polojwar", "chamorshi", "chamorhsi", "maharashtra", "mayur@", 440042, 858566588);
        Contact contactTwo = new Contact("nandini", "witg", "ka", "ch", "ka", "nam@", 440042, 858566588);
        Contact contactThree = new Contact("yamini", "sinde", "medachal", "guntur", "chandigarh", "hii@", 4585, 58568641);
        Contact contactFour = new Contact("katrina", "lambe", "gad", "nag", "maharashtra", "hah@", 455225, 858566588);

        //ading contacts to list

        contacts.add(contactOne);
        contacts.add(contactTwo);
        contacts.add(contactThree);
        contacts.add(contactFour);


        System.out.println("welcome to address book. " +
                "select any of the choice in the below " +
                "\n Hint -> 1. Display contact 2. edit existing contact 3.remove existing contact ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt(4);
        if (choice == 1) {
            System.out.println("display adress book");
            for (Contact e : contacts) {
                System.out.println(e);
            }
        } else if (choice == 2) {
            System.out.println("edit existing contact");
            System.out.println("select which contact have to edit" +
                    "ie.1 . mayur 2. nandini 3.yamini 4.katrina");
            int edit = scanner.nextInt(5);
            if (edit == 1) {
                System.out.println("mayur");
                System.out.println("revise name");
                contactOne.setFirstName(scanner.next());
                System.out.println("revise lastName");
                contactOne.setLastName(scanner.next());
                System.out.println("revise address");
                contactOne.setAddress(scanner.next());
                System.out.println("revise city");
                contactOne.setCity(scanner.next());
                System.out.println("revise State");
                contactOne.setState(scanner.next());
                System.out.println("revise email");
                contactOne.setEmail(scanner.next());
                System.out.println("revise zip");
                contactOne.setZip(scanner.nextInt());
                System.out.println("revise phoneNumber");
                contactOne.setPhoneNumber(scanner.nextLong());
                for (Contact e : contacts) {
                    System.out.println(e);
                }
            } else if (edit == 2) {
                System.out.println("nadini");
                System.out.println("revise name");
                contactTwo.setFirstName(scanner.next());
                System.out.println("revise lastName");
                contactTwo.setLastName(scanner.next());
                System.out.println("revise address");
                contactTwo.setAddress(scanner.next());
                System.out.println("revise city");
                contactTwo.setCity(scanner.next());
                System.out.println("revise State");
                contactTwo.setState(scanner.next());
                System.out.println("revise email");
                contactTwo.setEmail(scanner.next());
                System.out.println("revise zip");
                contactTwo.setZip(scanner.nextInt());
                System.out.println("revise phoneNumber");
                contactTwo.setPhoneNumber(scanner.nextLong());
                for (Contact e : contacts) {
                    System.out.println(e);
                }
            } else if (edit == 3) {
                System.out.println("yamini");
                System.out.println("revise name");
                contactThree.setFirstName(scanner.next());
                System.out.println("revise lastName");
                contactThree.setLastName(scanner.next());
                System.out.println("revise address");
                contactThree.setAddress(scanner.next());
                System.out.println("revise city");
                contactThree.setCity(scanner.next());
                System.out.println("revise State");
                contactThree.setState(scanner.next());
                System.out.println("revise email");
                contactThree.setEmail(scanner.next());
                System.out.println("revise zip");
                contactThree.setZip(scanner.nextInt());
                System.out.println("revise phoneNumber");
                contactThree.setPhoneNumber(scanner.nextLong());
                for (Contact e : contacts) {
                    System.out.println(e);
                }
            } else if (edit == 4) {
                System.out.println("katrina");
                System.out.println("revise name");
                contactFour.setFirstName(scanner.next());
                System.out.println("revise lastName");
                contactFour.setLastName(scanner.next());
                System.out.println("revise address");
                contactFour.setAddress(scanner.next());
                System.out.println("revise city");
                contactFour.setCity(scanner.next());
                System.out.println("revise State");
                contactFour.setState(scanner.next());
                System.out.println("revise email");
                contactFour.setEmail(scanner.next());
                System.out.println("revise zip");
                contactFour.setZip(scanner.nextInt());
                System.out.println("revise phoneNumber");
                contactFour.setPhoneNumber(scanner.nextLong());
                for (Contact e : contacts) {
                    System.out.println(e);
                }
            } else {
                System.out.println("your address book is end");
            }
        }else{
            System.out.println("invalid input");
        }
    }
}
