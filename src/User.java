import java.time.LocalDate;

public class User {

    private String vorname;
    private String nachname;
    private String email;
    private int geburtsjahr;


    public User(String email, int geburtsjahr) {
        this.setEmail(email);
        this.setGeburtsjahr(geburtsjahr);

    }

    public User(String email, int geburtsjahr, String vorname, String nachname) {
        this(email, geburtsjahr);
        this.setVorname(vorname);
        this.setNachname(nachname);
    }

    public String getVorname() {
        return this.vorname;
    }

    public void setVorname(String newVorname) {
        this.vorname = newVorname;
    }

    public void setNachname(String newNachname) {
        this.nachname = newNachname;
    }

    public String getNachname() {
        return this.nachname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String newEmail) {
        if (newEmail.contains("@") && newEmail.contains(".")) {
            this.email = newEmail;
        } else {
            throw new RuntimeException("Die Emailadresse muss sowohl @ als auch einen Punkt enthalten");
        }
    }

    public int getGeburtsjahr() {
        return this.geburtsjahr;
    }

    public void setGeburtsjahr(int neuesGeburtsjahr) {
        if (neuesGeburtsjahr > 0) {
            this.geburtsjahr = neuesGeburtsjahr;
        } else {
            throw new RuntimeException("Negatives Geburtsjahr ist nicht gültig");
        }
    }

    public boolean istVolljaehrig() {
        if ((LocalDate.now().getYear() - this.geburtsjahr) >= 18) {
            return true;
        }
        return false;
    }


}


