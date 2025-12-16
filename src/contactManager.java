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
                displayContact();
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
