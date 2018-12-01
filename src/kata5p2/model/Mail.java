package kata5p2.model;

public class Mail {

    private final String mail;

    public Mail(String mail){
        this.mail = mail.substring(mail.indexOf('@') + 1);

    }

    public String getDomain() {
        return mail;
    }
}
