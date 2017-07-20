/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package social;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author giovannimoreddu
 */
public class PostFactory {

    private static ArrayList<Post> posts = new ArrayList<>();

    public static Post getPostById(int id) {
        if (posts.isEmpty()) {
            riempi();
        }
        for (Post a : posts) {
            if (a.getId() == id) {
                return a;
            }

        }
        return null;
    }

    List<Post> getPostList(User usr) {
        if (posts.isEmpty()) {
            riempi();
        }
        ArrayList<Post> lista = new ArrayList<>();
        for (Post a : posts) {
            if (a.getUtente().equals(usr)) {
                lista.add(a);
            }
        }

        return lista;
    }

    List<Post> getPostList(Group gr) {
        if (posts.isEmpty()) {
            riempi();
        }
        ArrayList<Post> lista = new ArrayList<>();
        for (Post a : posts) {
            if (a.getGroup().equals(gr)) {
                lista.add(a);
            }
        }

        return lista;
    }

    private static void riempi() {
        Calendar time1 = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
        time1.set(3, 15, 2017, 13, 45, 20);
        User utente1 = UserFactory.getUserById(1);
        Post post1 = new Post(1, "Don...Dont uorri det samuan...sam pipol anderstend uot ai sed!dont uorri!", time1, utente1, GroupFactory.getGroupById(1));
        posts.add(post1);

        Calendar time2 = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
        time2.set(4, 16, 2017, 23, 45, 20);
        User utente2 = UserFactory.getUserById(2);
        File file1 = new File("razzi1.jpg");
        Media media1 = new Media(1, file1);
        Post post2 = new Post(2, "", time2, utente2, media1, GroupFactory.getGroupById(1));
        posts.add(post2);

        Calendar time3 = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
        time3.set(5, 12, 2017, 13, 05, 40);
        User utente3 = UserFactory.getUserById(3);
        Post post3 = new Post(3, "Quando parlai con il Papa\n"
                + "\n"
                + "http://www.video.mediaset.it/video/scherziaparte/scherzi/507195/lo-scherzo-a-paolo-brosio.html ", time3, utente3, GroupFactory.getGroupById(1));
        posts.add(post3);
    }

}
