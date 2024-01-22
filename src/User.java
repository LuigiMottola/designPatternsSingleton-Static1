public class User {

    private String nome = "";
    private int eta = 0;
    private static User instance;

    private User(){}

    public static User getInstance() {
        if (instance == null){
            return new User();
        }
        return instance;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getEta() {
        return eta;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }

    public void stampaInfo() {
        System.out.println("User{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}');
    }
}