public class App {
    public static void main(String[] args) throws Exception {
        
        // Nota: PRIMEIRO voc tem que construir o arquivo com a classe e so depois fazer a declaracao da linha abaixo, senao da bug.
        Pessoa brasileiro = new Pessoa(null);
        brasileiro.nome = "Fernanda"; 
        brasileiro.PrintPessoa();

        Pessoa alemao = new Pessoa(null);
        alemao.nome = "Xuxa"; // da o nome
        alemao.PrintPessoa(); // imprime o nome e a cor
        alemao.ResultadoCalcularIMC(80, 1.70);

        Pessoa grego = new Pessoa(null);
        grego.ResultadoCalcularIMC(40, 1.50);

    }
}
