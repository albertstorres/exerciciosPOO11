//11 - ) Defina uma interface Autenticavel com métodos para autenticação e implemente-a
//       em classes como Usuario e Administrado.

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("albertstorres","abc1234");
        Administrador administrador = new Administrador("antoniostorres", "abc1234");

        System.out.println(usuario.autenticacao("albertstorres", "abc1234"));
        System.out.println(usuario.autenticacao("antoniostorres","abcd1234"));
    }
}