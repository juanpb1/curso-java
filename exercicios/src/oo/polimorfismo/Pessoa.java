package oo.polimorfismo;

public class Pessoa {
    private double peso;

    public Pessoa(double peso) {
        this.peso = peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getPeso() {
        return peso;
    }

    void comer(Comida c){
        this.peso += c.getPeso();
    }

    public String toString(){
        String dadosPessoa = String.format("A pessoa pesa %.2fKg.", peso);

        return dadosPessoa;
    }
}
