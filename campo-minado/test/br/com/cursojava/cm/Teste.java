package br.com.cursojava.cm;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class Teste {
    @Test
    public void test(){
        int a = 1 + 1;

        assertEquals(2, a);
    }
}
