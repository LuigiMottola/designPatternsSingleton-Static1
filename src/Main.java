public class Main {

    public static void main(String[] args) {

        User user1 = User.getInstance();

        user1.stampaInfo();

        User user2 = User.getInstance();

        user2.setEta(25);
        user2.setNome("Paul");

        user2.stampaInfo();
    }
}