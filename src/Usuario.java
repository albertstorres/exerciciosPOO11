public class Usuario implements Autenticavel{
    private String login;
    private String senha;

    public Usuario (String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String autenticacao (String login, String senha) {
        if ((login == this.login) && (senha == this.senha)){
            return "Usuário logado!";
        } else {
            return "Usuário ou senha inválido!";
        }
    }
}
