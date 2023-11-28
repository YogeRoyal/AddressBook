import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creating an instance of AddressBook
        AddressBook a1 = new AddressBook("Book1");
        Scanner sc = new Scanner(System.in);
        String menu = "Press \n1:Adding A contact\n2: Displaying All Contact\n3: Search by first name\n4: Search by Phone number\n5: Delete by USer First name\n6: Update phone Number";

        //Menu based programming
        int choice = 1;
        do {
            System.out.println("Welcome to AddressBook");
            System.out.println(menu);

            CrudOperation c1 = new CrudOperation();
            int input = sc.nextInt();

            switch (input) {
                //adding the contact in The current address book instance using addContact method
                case 1 -> c1.AddContact(a1);
                //printing the current address book contact list
                case 2 -> System.out.println(a1.contactList);
                //Searching a name in the addressbook
                case 3 -> {
                    System.out.println("Enter the name you want to search");
                    String s1 = sc.next();
                    c1.searchByFirstName(a1,s1);
                }
                case 4 -> {
                    System.out.println("Enter the Phone Number you want to search");
                    String s1 = sc.next();
                    c1.searchByPhoneNumber(a1,s1);
                }
                case 5 -> {
                    System.out.println("Enter the Name you want to delete");
                    String s1 = sc.next();
                    c1.deleteContactByfName(a1,s1);
                }
                case 6 -> {
                    System.out.println("Enter the Name you want to update the phone number");
                    String s1 = sc.next();
                    c1.updatePhoneNumberByName(a1,s1);
                }
                default -> System.out.println("Enter valid option");
            }
            System.out.println("Enter 0 to exit");
            choice=sc.nextInt();
        }
        while (choice!=0);
    }
}