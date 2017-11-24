package Classes;

/**
 * Created by Lorelei on 24/11/2017.
 */

public class User {
    private int id;
    private String prenom;
    private String telephone;

    public User(int id, String prenom, String telephone) {
        this.id = id;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
