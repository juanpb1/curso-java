package excecao;

public class ChecadaVsNaoChegada {
    public static void main(String[] args) {
        
        try{
            gerarErro01();
        }catch(RuntimeException e){
            System.out.println("Ocorreu um erro no primeiro método.");
        }

        try{
            gerarErro02();
        }catch(Exception e){
            System.out.println("Ocorreu um erro no segundo método.");
        }

    }

    // Exceção NÃO chegada ou NÃO verificada
    public static void gerarErro01(){
        throw new RuntimeException("Ocorreu um erro #01.");
    }

    // Exceção chegada ou verificada
    public static void gerarErro02() throws Exception{
        throw new Exception("Ocorreu um erro #02.");
    }
}   
