public class Administrador implements Autenticavel {
    private String username;
    private String senha;

    public Administrador (String username, String senha) {
        this.username = username;
        this.senha = senha;
    }

    public String autenticacao (String username, String senha) {
        if ((this.username == username) && (this.senha == senha)) {
            return "Administrador logado!";
        } else {
            return "Username ou senha inválido!";
        }
    }
}
