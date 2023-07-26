package excecao;

public class Causa {
    public static void main(String[] args) {

        Aluno aluno = null;

        try{
            metodoA(aluno);
        }catch(Exception e){
            System.out.println(e.getCause().getMessage());
        }
    }

    public static void metodoA(Aluno aluno){
        try{
            metodoB(aluno);
        }catch(Exception causa){
            throw new IllegalArgumentException(causa);
        }
    }

    public static void metodoB(Aluno aluno){
        if(aluno == null){
            throw new RuntimeException("O Aluno está NULO!!!!");
        }

        System.out.println(aluno.nome);
        
    }
}
