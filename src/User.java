import java.time.LocalDate;

public class User {

    String vorname;
    String nachname;
    private String email;
    private int geburtsjahr;


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


