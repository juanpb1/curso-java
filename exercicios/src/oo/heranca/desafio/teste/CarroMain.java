package oo.heranca.desafio.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;

public class CarroMain {
    public static void main(String[] args){

        Carro c1 = new Carro(250);
        c1.acelerar();
        c1.acelerar();
        c1.frear();
        c1.frear();
        c1.frear();

        Ferrari c2 = new Ferrari(320);
        c2.ligarTurbo();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c2.velocidadeDoAr());
    }       
}
