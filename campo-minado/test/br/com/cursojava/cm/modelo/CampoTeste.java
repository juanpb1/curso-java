package br.com.cursojava.cm.modelo;

import static org.junit.Assert.*;

import org.junit.*;

import br.com.cursojava.cm.excecao.ExplosaoException;

public class CampoTeste {

    private Campo campo;

    @Before
    public void iniciarCampo(){
        campo = new Campo(3, 3);
    }

    @Test
    public void testeVizinhoDistanciaEsquerda(){
        Campo vizinho = new Campo(3, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);

        assertTrue(resultado);
    }

    @Test
    public void testeVizinhoDistanciaDireita(){
        Campo vizinho = new Campo(3, 4);
        boolean resutado = campo.adicionarVizinho(vizinho);

        assertTrue(resutado);
    }

    @Test
    public void testeVizinhoEmCima(){
        Campo vizinho = new Campo(2, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);

        assertTrue(resultado);
    }

    @Test
    public void testeVizinhoEmbaixo(){
        Campo vizinho = new Campo(4, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);

        assertTrue(resultado);
    }

    @Test
    public void testeVizinhoDiagonal(){
        Campo vizinho = new Campo(4, 4);
        boolean resultado = campo.adicionarVizinho(vizinho);

        assertTrue(resultado);
    }

    @Test
    public void testeNaoVizinho(){
        Campo vizinho = new Campo(1, 1);
        boolean resultado = campo.adicionarVizinho(vizinho);

        assertFalse(resultado);
    }

    @Test
    public void testeValorPadraoAtributoMarcado(){
        assertFalse(campo.isMarcado());
    }

    @Test 
    public void testeAlternarMarcacao(){
        campo.altenarMarcacao();
        assertTrue(campo.isMarcado());
    }

    @Test
    public void testeAlternarMarcacaoDuasChamadas(){
        campo.altenarMarcacao();
        campo.altenarMarcacao();
        assertFalse(campo.isMarcado());
    }

    @Test
    public void testeAbrirNaoMinadoMarcado(){
        assertTrue(campo.abrir());
    }

    @Test
    public void testeAbrirMinadoMarcado(){
        campo.altenarMarcacao();
        campo.minar();
        assertFalse(campo.abrir());
    }

    @Test
    public void testeAbrirMinadoNaoMarcado(){
        campo.minar();

        assertThrows(ExplosaoException.class, ()->{
            campo.abrir();
        });
    }

    @Test
    public void testeAbrirComVizinhos1(){

        Campo campo11 = new Campo(1, 1);
        Campo campo22 = new Campo(2, 2);
        campo22.adicionarVizinho(campo11);

        campo.adicionarVizinho(campo22);
        campo.abrir();

        assertTrue(campo22.isAberto() && campo11.isAberto());

    }

    public void testeAbrirComVizinhos2(){

        Campo campo11 = new Campo(1, 1);
        Campo campo12 = new Campo(1, 2);
        campo12.minar();

        Campo campo22 = new Campo(2, 2);
        campo22.adicionarVizinho(campo11);
        campo22.adicionarVizinho(campo12);

        campo.adicionarVizinho(campo22);
        campo.abrir();

        assertTrue(campo22.isAberto() && campo11.isFechado());

    }
}
