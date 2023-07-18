package classe;

public class Usuario {
    String nome;
    String email;

    Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public boolean equals(Object obj){

        if(obj instanceof Usuario){
            Usuario outroUsuario = (Usuario) obj;

            boolean nomeIgual = outroUsuario.nome.equals(this.nome);
            boolean emailIgual = outroUsuario.email.equals(this.email);
            boolean verificaIgualdade = nomeIgual && emailIgual;

            return verificaIgualdade;
        }else{
            return false;
        }

    }
}
