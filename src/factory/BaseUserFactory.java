/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import model.User;

/**
 *
 * @author ASUS ROG
 */
public abstract class BaseUserFactory {
    public abstract User createUser(String type);
}
