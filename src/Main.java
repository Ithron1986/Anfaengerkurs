public class Main {
    static boolean logincheck(User user){
        if (user == null){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Nutzerverwaltung nutzerverwaltung = new Nutzerverwaltung();
        nutzerverwaltung.register("stefan.driesslein@web.de", 1986, "Stefan");
        nutzerverwaltung.register("rene.Richter@web.de", 1988, "Rene");


        User profil1 = nutzerverwaltung.login("rene.Richter@web.de", "Kaputt");

    /*    if (profil1 != null) {

        } else {

        }*/
        boolean loogedIn = logincheck(profil1);
        if (loogedIn) {
            System.out.println(profil1.getGeburtsjahr());
        } else {
            System.out.println("could not login user");
        }

    }

}
