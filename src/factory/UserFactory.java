/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import java.util.ArrayList;
import java.util.Scanner;
import model.Manager;
import model.PropertyOwner;
import model.Tenant;
import model.User;

/**
 *
 * @author ASUS ROG
 */
public class UserFactory extends BaseUserFactory {

    @Override
    public User createUser(String type) {
        String userID = "";
        String firstName = "";
        String lastName = "";
        String email = "";
        String password = "";
        ArrayList<String> listContractID = new ArrayList<>();
        ArrayList<String> listPropertyID = new ArrayList<>();
        User newUser = null;
        switch (type.toLowerCase()) {
            case "tenant":
                inputInfo(userID, firstName, lastName, email, password);
                inputContractList(listContractID);
                newUser = new Tenant(userID, firstName, lastName, email, password, listContractID);
                break;
            case "property owner":
                inputInfo(userID, firstName, lastName, email, password);
                inputPropertyList(listPropertyID);
                newUser = new PropertyOwner(userID, firstName, lastName, email, password, listPropertyID);
                break;
            case "manager":
                inputInfo(userID, firstName, lastName, email, password);
                inputContractList(listContractID);
                newUser = new Manager(userID, firstName, lastName, email, password, listContractID);
                break;
        }
        return newUser;
    }

    public static void inputInfo(String userID, String firstName, String lastName, String email, String password) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your ID:");
        userID = reader.nextLine();
        System.out.println("Enter your first name:");
        firstName = reader.nextLine();
        System.out.println("Enter your last name:");
        lastName = reader.nextLine();
        System.out.println("Enter your email address:");
        email = reader.nextLine();
        System.out.println("Enter your password:");
        password = reader.nextLine();
    }
    
    public static void inputContractList(ArrayList<String> listContractID) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many contracts do you have?");
        int numOfContract = reader.nextInt();
        reader.nextLine();
        if (numOfContract > 0) {
            for (int i = 0; i < numOfContract; i++) {
                System.out.println("Enter the contract's ID:");
                String newContractID = reader.nextLine();
                listContractID.add(newContractID);
            }
        }
    }
    
    public static void inputPropertyList(ArrayList<String> listPropertyID) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many properties do you have?");
        int numOfContract = reader.nextInt();
        reader.nextLine();
        if (numOfContract > 0) {
            for (int i = 0; i < numOfContract; i++) {
                System.out.println("Enter the property's ID:");
                String newPropertyID = reader.nextLine();
                listPropertyID.add(newPropertyID);
            }
        }
    }
}
