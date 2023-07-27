import br.com.cursojava.cm.modelo.Tabuleiro;
import br.com.cursojava.cm.visao.TabuleiroConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 5);
        new TabuleiroConsole(tabuleiro);
    }
}
