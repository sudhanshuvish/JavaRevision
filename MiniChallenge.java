import java.util.HashMap;
import java.util.Map;

public class MiniChallenge {

    public static Map<String, String> addContact(String name, String number, Map<String, String> contact){

        contact.put(name, number);
        System.out.println("Contact Added!");
        return contact;
    }

    public static Map<String, String> deleteContact(String name,Map<String, String> contact){
        contact.remove(name);

        return contact;
    }

    public static String searchUserByName(String name, Map<String, String> contact){
        return contact.get(name);

    }



    public static void main(String[] args) {

        Map<String, String> contact = new HashMap<>();

        addContact("Peter", "8125699125", contact);
        addContact("Lois", "8125699126", contact);
        addContact("Brian", "8125699127", contact);
        System.out.println(addContact("Meg", "8125699128", contact));

        System.out.println(deleteContact("Meg", contact));

        System.out.println(searchUserByName("Brian", contact)); //I dont know how to make case insensitive

        System.out.println("All contacts: "+contact);











    }
}
