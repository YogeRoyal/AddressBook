import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creating an instance of AddressBook
        AddressBook a1 = new AddressBook("Book1");
        Scanner sc = new Scanner(System.in);

        //Menu based programming
        int choice = 1;
        do {
            System.out.println("Welcome to AddressBook");
            System.out.println("Press \n 1:Adding A contact\n 2: Displaying All Contact\n 3:Search By name");

            int input = sc.nextInt();

            switch (input) {
                //adding the contact in The current address book instance using addContact method
                case 1 -> AddContact(a1);
                //printing the current address book contact list
                case 2 -> System.out.println(a1.contactList);
                case 3 ->searchByName(a1);
                default -> System.out.println("Enter valid option");
            }
            System.out.println("Enter 0 to exit");
            choice = sc.nextInt();
        } while (choice != 0);


    }

    private static void AddContact(AddressBook a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String fname = sc.next();
        System.out.println("Enter last name");
        String lname = sc.next();
        System.out.println("Enter Phone number");
        String phoneNumber = sc.next();
        System.out.println("Enter ZipCode");
        int zip = sc.nextInt();
        System.out.println("Enter Relation");
        String relation = sc.next();
        //person constructor
        Person p1 = new Person(fname, lname, phoneNumber, zip, relation);
        //added to the address book instance
        a.contactList.add(p1);
    }
    private static void searchByName(AddressBook a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name to search:");
        String firstName = sc.next();

        Person foundPerson = a.searchByName(firstName);

        if (foundPerson != null) {
            System.out.println("Person found: " + foundPerson);
        } else {
            System.out.println("Person not found.");
        }
    }
}