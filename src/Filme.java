import org.w3c.dom.ls.LSOutput;

public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPLano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;


    void  exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return  somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
