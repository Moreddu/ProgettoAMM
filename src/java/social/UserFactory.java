/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package social;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author giovannimoreddu
 */
public class UserFactory {
    
        private static ArrayList<User> users = new ArrayList<>();

    public static User getUserById(int id) {
        if (users.isEmpty()) {
            riempi();
        }
        for (User a : users) {
            if (a.getId() == id) {
                return a;
            }

        }
        return null;
    }
public static User getUserByNomeCognome(String nome, String cognome) {
        if (users.isEmpty()) {
            riempi();
        }
        for (User a : users) {
            if (a.getNome().equalsIgnoreCase(nome) && a.getCognome().equalsIgnoreCase(cognome)) {
                return a;
            }

        }
        return null;
    }    
    

    public static User getUserByMail(String mail) {
        if (users.isEmpty()) {
            riempi();
        }
        for (User a : users) {
            if (a.getMail().equalsIgnoreCase(mail)) {
                return a;
            }

        }
        return null;
    }
    
        public static User getAuthUser(String mail, String password) {
        if (users.isEmpty()) {
            riempi();
        }
        for (User a : users) {
            if (a.getMail().equalsIgnoreCase(mail) && a.getPassword().equalsIgnoreCase(password)) {
                return a;
            }

        }
        return null;
    }
    
    private static void riempi() {
        
        User utente1 = new User(1, "Matteo", "Renzi", "matterenzi@gmail.com", "Sonoidiota73");
        users.add(utente1);
        utente1.setPresentation("Sono un idiota del 73");
        
        User utente2 = new User(2, "Antonio", "Razzi", "antonyrazzy@gmail.com", "Sonoidiota60");
        users.add(utente2);
        utente2.setPresentation("Sono un idiota del 60");
        
        User utente3 = new User(3, "Paolo", "Brosio", "paulbrosio@gmail.com", "Sonoidiota66");
        users.add(utente3);
    }
}
