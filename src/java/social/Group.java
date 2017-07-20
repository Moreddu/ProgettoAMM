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
public class Group {
    
    private int id;
    private String nome;
    private ArrayList<User> users= new ArrayList<>();

    public Group(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
    
    public void addUser(User user){
        if (!users.contains(user))
        users.add(user);
        
    }
    
    public void removeUser(User user){
        if(users.contains(user)){
            users.remove(user);
        }
    }
    
    
    
    
    
}
