public class Pessoa {

// atributos
public String nome; 
public String cor; 
public int idade;
protected String sexo;
double peso;
double altura;

 //Metodos:

 // Metodo Constructor: 
 // como eh um metodo que recebe um parametro eh uma "Sobrecarga de Metodo"
 public Pessoa (String nome) {
        this.nome = nome; 
        cor = " amarelo ";
 }

 // metodo para imprimir informacoes da pessoa
 public void PrintPessoa(){
       System.out.println("seu nome eh: " + nome + ", sua cor eh: " + cor);}

public void ResultadoCalcularIMC(double pes, double alt){
    double imc; 
    peso=pes;
//this.peso = pes;
//this.altura = alt;
    altura= alt; 
    imc = peso/(altura*altura);
     System.out.println("seu imc eh: " + imc);
}


/* public void ResultadoCalcularIMC(resultado){
    System.out.println(imc);

} */
}
