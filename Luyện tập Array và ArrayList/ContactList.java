package BTarraylist;

import java.util.*;

public class ContactList {
    List<Contact> contactList;
    Scanner sc = new Scanner(System.in);

    public ContactList () {
        contactList = new ArrayList<>();
    }

    public void ContactListAdd (Contact contact) {
        this.contactList.add(contact);
    }

    public void DeleteContactListAdd (String name) {
        Contact contact = contactList.stream().filter(contact1 -> contact1.getName().equals(name)).findFirst()
                .orElse(null);
        if (contact == null) {
            return;
        }
        else {
            this.contactList.remove(contact);

        }
    }

    public void InsertPhone () {
        contactList.toString();
        for (Contact c : contactList) {
            System.out.println(c);
        }
    }

    public void SearchContact (String name) {
        boolean searched = false;
        for (Contact s : contactList) {
            if (s.getName().contains(name)) {
                searched = true;
                System.out.println(s.toString());
                break;
            }
        }
        if (!searched) {
            System.out.println("No");
        }
    }

   /* public void UpdateContact (String name,String phone) {
        String s = name;
        s = s.substring(0, s.indexOf(","));
        contactList.set(s.indexOf(s), );
    }

    */
    public void SortContact () {
        Collections.sort(contactList, new Comparator<Contact>() {
            @Override
            public int compare(Contact o1, Contact o2) {
                return o1.getName().compareTo(String.valueOf(o2));
            }
        });
        for (Contact c : contactList) {
            System.out.println(c);
        }
    }

}
