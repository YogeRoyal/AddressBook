import java.util.ArrayList;

class AddressBook{
    String Name;
    ArrayList<Person> contactList = new ArrayList<>();

    AddressBook(String name){
        this.Name =name;
    }
    public Person searchByName(String firstName) {
        for (Person person : contactList) {
            if (person.getFname().equalsIgnoreCase(firstName)) {
                return person;
            }
        }
        return null;
    }
}