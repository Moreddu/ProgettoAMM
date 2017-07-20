/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package social;

import java.util.Calendar;



/**
 *
 * @author giovannimoreddu
 */
public class Post {
    private int id;
    private String testo;
    private Calendar time;
    private User utente;
    private Media media;
    private Group group;

    protected Post(int id, String testo, Calendar time, User utente, Group group) {
        this.id = id;
        this.testo = testo;
        this.time = time;
        this.utente = utente;
        this.group= group;
    }

    protected Post(int id, String testo, Calendar time, User utente, Media media, Group group) {
        this.id = id;
        this.testo = testo;
        this.time = time;
        this.utente = utente;
        this.media = media;
        this.group= group;
    }

    public int getId() {
        return id;
    }

    public String getTesto() {
        return testo;
    }

    public Calendar getTime() {
        return time;
    }

    public User getUtente() {
        return utente;
    }

    public Media getMedia() {
        return media;
    }

    public Group getGroup() {
        return group;
    }
    
    

    

}