/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package social;

import java.util.ArrayList;

/**
 *
 * @author giovannimoreddu
 */
public class GroupFactory {

    private static ArrayList<Group> groups = new ArrayList<>();

    public static Group getGroupById(int id) {
        if (groups.isEmpty()) {
            riempi();
        }
        for (Group a : groups) {
            if (a.getId() == id) {
                return a;
            }

        }
        return null;
    }

    public static Group getGroupByMail(String nome) {
        if (groups.isEmpty()) {
            riempi();
        }
        for (Group a : groups) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                return a;
            }

        }
        return null;
    }

    private static void riempi() {
        Group gruppo1 = new Group(1, "Calcetto");
        gruppo1.addUser(UserFactory.getUserById(1));
        gruppo1.addUser(UserFactory.getUserById(3));
        groups.add(gruppo1);

        Group gruppo2 = new Group(2, "Gruppo Sanguigno");
        gruppo2.addUser(UserFactory.getUserById(2));
        gruppo2.addUser(UserFactory.getUserById(3));
    }

}
