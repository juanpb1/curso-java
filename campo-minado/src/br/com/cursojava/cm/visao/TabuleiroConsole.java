package br.com.cursojava.cm.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.cursojava.cm.excecao.ExplosaoException;
import br.com.cursojava.cm.excecao.SairException;
import br.com.cursojava.cm.modelo.Tabuleiro;

public class TabuleiroConsole {
    
    private Tabuleiro tabuleiro;
    private Scanner input = new Scanner(System.in);

    public TabuleiroConsole(Tabuleiro tabuleiro){
        this.tabuleiro = tabuleiro;

        executarJogo();
    }

    private void executarJogo(){

        try{
            boolean continuar = true;

            while(continuar){
                cicloDoJogo();

                System.out.println("Outra partida? (S/n)");
                String resposta = input.nextLine();

                if("n".equalsIgnoreCase(resposta)){
                    continuar = false;
                }else{
                    tabuleiro.reiniciar();
                }
            }
        }catch(SairException e){
            System.out.println("Jogo encerrado!!!");
            
        }finally{
            input.close();
        }

    }

    private void cicloDoJogo(){
        try{
            while(!tabuleiro.objetivoAlcancado()){
                System.out.println(tabuleiro);

                String digitado = capturarValorDigitado("Digite (x, y): ");
                Iterator<Integer> xy = Arrays.stream(digitado.split(",")).map(e -> Integer.parseInt(e.trim())).iterator();

                digitado = capturarValorDigitado("1 - Abrir ou 2 - (Des)Marcar: ");

                if("1".equals(digitado)){
                    tabuleiro.abrir(xy.next(), xy.next());
                }else if("2".equals(digitado)){
                    tabuleiro.altenarMarcacao(xy.next(), xy.next());
                }
            }
        }catch(ExplosaoException e) {
			System.out.println(tabuleiro);
			System.out.println("Você perdeu!");
		}
    }

    private String capturarValorDigitado(String texto){
        System.out.println(texto);
        String digitado = input.nextLine();

        if("sair".equalsIgnoreCase(digitado)){
            throw new SairException();
        }

        return digitado;
    }

}
