package bean;

public class Annonce {

    private int id;
    private String title;
    private String description;
    private String mail;
    private String adresse;

    public Annonce(int id, String title, String description, String mail, String adresse) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.mail = mail;
        this.adresse = adresse;
    }

    public Annonce(String title, String description, String mail, String adresse) {
        this.title = title;
        this.description = description;
        this.mail = mail;
        this.adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
