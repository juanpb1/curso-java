package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

    boolean ligarTurbo = false;
    boolean desligarTurbo = false;
    boolean ligarAr = false;
    boolean desligarAr = false;

    public Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public int getDelta(){
        if(ligarTurbo && !ligarAr){
            return 35;
        }else if(ligarTurbo && ligarAr){
            return 30;
        }else{
            return 15;
        }
    }

    
    @Override
    public void acelerar(){
        velocidadeAtual += getDelta();
    }

    @Override
    public void frear(){
        if(this.velocidadeAtual > 0 ){
            velocidadeAtual -= 15;
        }
    }

    @Override
    public void ligarTurbo(){
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo(){
        desligarTurbo = false;
    }

    @Override
    public void ligarAr(){
        ligarAr = true;
    }

    @Override
    public void desligarAr(){
        desligarAr = false;
    }

}
