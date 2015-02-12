package models;

import javafx.scene.control.RadioMenuItem;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.Random;

@Entity
public class Perola extends Model {
    @Id
    public Long id;
    public String texto;
    public String autor;

    public static Perola getRandom() {
        Random random = new Random(new Date().getTime());
        int randomId = Math.abs(random.nextInt() % (find.all().size()));
        System.out.println("id " + randomId);
        return find.all().get(randomId);
    }

    public static Finder<Long,Perola> find = new Finder<Long,Perola>(
            Long.class, Perola.class
    );

}
