import java.util.ArrayList;
import java.util.List;

public class Nutzerverwaltung {

    private List<User> userliste;

    public Nutzerverwaltung() {
        this.userliste = new ArrayList<>();
    }

    public void register(String email, int geburtsjahr, String passwort) {
        User user = new User(email, geburtsjahr, passwort);
        userliste.add(user);

    }

    public User login(String email, String passwort) {
        for (User user : userliste) {
            if (user.getEmail().equals(email) && user.getPasswort().equals(passwort)) {
                return user;
            }
        }
        return null;
    }


}
