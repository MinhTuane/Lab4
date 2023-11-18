/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import factory.BaseUserFactory;
import factory.UserFactory;
import java.util.Scanner;
import model.User;

/**
 *
 * @author ASUS ROG
 */
public class Client {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What kind of user are you?:");
        String userType = reader.nextLine();
        BaseUserFactory newUserFactory = new UserFactory();
        User user1 = newUserFactory.createUser(userType);
//        User user2 = newUserFactory.createUser("property owner");
//        User user3 = newUserFactory.createUser("manager");
        
        System.out.println(user1.toString());
//        System.out.println(user2.toString());
//        System.out.println(user3.toString());
    }
}
