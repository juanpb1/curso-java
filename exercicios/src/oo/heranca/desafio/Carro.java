package oo.heranca.desafio;

public class Carro {
    int velocidadeAtual = 0;
    final int VELOCIDADE_MAXIMA;
    private int delta = 5;

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){
        if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += getDelta();
        }
    }

    public void frear(){
        if(this.velocidadeAtual > 0 ){
            velocidadeAtual -= 5;
        }
    }

    public String toString(){
        if(this.velocidadeAtual > 0){
            String dadosCarro = String.format("O carro está a %d km/h.", this.velocidadeAtual);
            return dadosCarro;
        }else{
            return "O carro está parado.";
        }
    }
}
