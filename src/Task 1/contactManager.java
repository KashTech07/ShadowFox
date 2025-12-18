import java.sql.SQLOutput;
import java.util.Scanner ;
import java.util.*;
import java.util.ArrayList;


public class contactManager {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<contact> list = new ArrayList<>();
    public static void main(String[] args){
        boolean running = true ;
        while(running){
            display();
            if(!sc.hasNextInt()){
                System.out.println("invalid input");
                sc.nextLine();
                continue;
            }
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice==1){
                addContact();
            }
            else if(choice==2){
                displayContacts();
            }
            else if(choice==3){
                updateContact();
        }
            else if(choice==4){
                deleteContact();
            }
            else if(choice==5){
                exit();
            }
    }}
          static void addContact(){
              contact c1 = new contact();
              System.out.println("Name : ");
              String n = sc.nextLine();
              c1.setName(n);
              System.out.println("Phone Number : ");
              String p = sc.nextLine();
              c1.setNumber(p);
              System.out.println("Email : ");
              String e = sc.nextLine();
              c1.setEmail(e);
              list.add(c1);
    }
    static void displayContacts() {
        if (list.isEmpty()) {
            System.out.println("The contact list is currently empty.");
            return;
        }
        System.out.println("\n--- Saved Contacts ---");
        for (int i = 0; i < list.size(); i++) {
            // (i + 1) makes it user-friendly (starting at 1 instead of 0)
            System.out.println((i + 1) + ". " + list.get(i).toString());
        }
    }
    static void updateContact() {
        if (list.isEmpty()) {
            System.out.println("No contacts to update.");
            return;
        }

        displayContacts();
        System.out.print("Enter the contact number to update: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();

        if (index >= 0 && index < list.size()) {
            contact c = list.get(index);

            System.out.println("Updating: " + c.getName());
            System.out.print("Enter new name: ");
            c.setName(sc.nextLine());

            System.out.print("Enter new number: ");
            c.setNumber(sc.nextLine());

            System.out.print("Enter new email: ");
            c.setEmail(sc.nextLine());

            System.out.println("Contact updated successfully!");
        } else {
            System.out.println("Invalid contact number.");
        }
    }
    static void deleteContact() {
        if (list.isEmpty()) {
            System.out.println("No contacts to delete.");
            return;
        }

        displayContacts();
        System.out.print("Enter the contact number to delete: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();

        if (index >= 0 && index < list.size()) {
            list.remove(index);
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Invalid contact number.");
        }
    }
    static void exit() {
        System.out.println("Saving data... (not really, but closing now!)");
        System.out.println("Goodbye!");
        System.exit(0);
    }

    public static void display() {
        System.out.println("----\uD83D\uDCDEContact Manager System----");
        System.out.println("1. Add New Contact");
        System.out.println("2. View All Contacts");
        System.out.println("3. Update Contacts");
        System.out.println("4. Delete Contact");
        System.out.println("5. Exit");
        System.out.println("Enter your choice : ");
    }
}
