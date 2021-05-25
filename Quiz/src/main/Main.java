package main;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ContactManager myContactsManager = new ContactManager();

        Contact contact1 = new Contact();
        contact1.setNama("Leonardo");
        contact1.setPhoneNumber("+6245613815");
        contact1.setEmail("leonardodcap@gmail.com");
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact();
        contact2.setNama("Yahya");
        contact2.setPhoneNumber("+6283123589");
        contact2.setEmail("yahya2@yahoo.co.id");
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact();
        contact3.setNama("Husain");
        contact3.setPhoneNumber("+6811234567");
        contact3.setEmail("hsn_gy2@gmail.com");
        myContactsManager.addContact(contact3);

        Contact contact4 = new Contact();
        contact4.setNama("Suya");
        contact4.setPhoneNumber("+5135567891");
        contact4.setEmail("suyaba4@evelon.com");
        myContactsManager.addContact(contact4);

        Contact contact5 = new Contact();
        contact5.setNama("Baiq");
        contact5.setPhoneNumber("+814567891235");
        contact5.setEmail("bai9_qi@evelon.com");
        myContactsManager.addContact(contact5);

        Scanner scanner=new Scanner(System.in);
        String x;
        do {
            System.out.print("Search Name : ");
            String search= scanner.next();
            Contact result = myContactsManager.searchContact(search);
            System.out.println("Looking for "+search+"'s contact ...");
            if(result!= null){
                System.out.println("Name            : "+result.getNama());
                System.out.println("Phone Number    : "+result.getPhoneNumber());
                System.out.println("Email Adress    : "+result.getEmail());
            }else {
                System.out.println("Contact Not Found ...");
            }
            System.out.println();
            System.out.print("Again ? (y/n) : ");
            x=scanner.next();
        }while (x.equals("y"));


    }

}
