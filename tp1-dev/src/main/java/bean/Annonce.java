package bean;

public class Annonce {

    private int id;
    private String title;
    private String description;
    private String mail;
    private String address;

    public Annonce(int id, String title, String description, String mail, String adresse) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.mail = mail;
        this.address = adresse;
    }

    public Annonce(String title, String description, String mail, String adresse) {
        this.title = title;
        this.description = description;
        this.mail = mail;
        this.address = adresse;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
