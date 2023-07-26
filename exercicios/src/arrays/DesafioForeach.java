package arrays;

public class DesafioForeach {
    public static void main(String[] args){

        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 8.2;
        notasAlunoA[1] = 7.5;
        notasAlunoA[2] = 9.5;

        double totalNotasAlunoA =0;
        
        System.out.println("Notas do aluno A: ");
        for (double nota : notasAlunoA) {

            System.out.printf("[%.1f] ", nota);
            totalNotasAlunoA += nota;
        }

        double mediaAlunoA = totalNotasAlunoA / notasAlunoA.length;
        System.out.printf("\nMédia do aluno A: [%.1f]", mediaAlunoA);


        System.out.println("\n");

        
        double[] notasAlunoB = {5.9, 8.2, 7.5};
        
        double totalNotasAlunoB = 0;

        System.out.println("Notas do aluno B:");
        for(double nota : notasAlunoB){
            System.out.printf("[%.1f]", nota);
            totalNotasAlunoB += nota;
        }

        double mediaAlunoB = totalNotasAlunoB / notasAlunoB.length;
        System.out.printf("\nMédia do aluno B: [%.1f]", mediaAlunoB);
    }
}
