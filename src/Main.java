public class Main {
    public static void main(String[] args) {

        User stefan = new User("stefan.driesslein@web.de", 1986, "Stefan", "Drießlein");


        System.out.println(stefan.getEmail());
        System.out.println(stefan.istVolljaehrig());
        System.out.println(stefan.getGeburtsjahr());

    }

}
