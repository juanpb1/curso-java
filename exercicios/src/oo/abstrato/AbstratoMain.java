package oo.abstrato;

public class AbstratoMain {
    public static void main(String[] args){

        Cachorro cachorro = new Cachorro();

        System.out.println(cachorro.respirar());
        System.out.println(cachorro.mamar());
        System.out.println(cachorro.mover());

    }
}
