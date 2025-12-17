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
          static void displayContacts(){
              for(contact c : list){
                  System.out.println(c.toString());
              }
          }
          static void updateContact(){

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
