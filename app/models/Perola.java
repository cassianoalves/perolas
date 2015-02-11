package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Perola extends Model {
    public String texto;
    public String autor;

    public static String getRandom() {
        return "Random perola " + new Date();
    }

}
