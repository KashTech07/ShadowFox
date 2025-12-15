import java.util.Scanner ;
import java.util.*;
import java.util.ArrayList;


public class contactManager {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<contact> list = new ArrayList<>();
    public static void display(String[] args) {
        System.out.println("----\uD83D\uDCDEContact Manager System----");
        System.out.println("1. Add New Contact");
        System.out.println("2. View All Contacts");
        System.out.println("3. Update Contacts");
        System.out.println("4. Delete Contact");
        System.out.println("5. Exit");
        System.out.println("Enter your choice : ");
    }
}
