import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Poderoso Chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: "+meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie serie = new Serie("Arcane", 2024);
        serie.exibeFichaTecnica();
        serie.setTemporadas(2);
        serie.setEspisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(25);
        System.out.println("Duração para maratonar Arcane: " + serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(meuFilme);

        Episodio episodioArcane = new Episodio();
        episodioArcane.setNumero(1);
        episodioArcane.setSerie(serie);
        episodioArcane.setTotalVizualizacoes(200);
        filtroRecomendacao.filtra(episodioArcane);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(serie);
        for (Titulo titulo : lista) {
            System.out.println(titulo);
            if (titulo instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificacao: " + filme.getClassificacao());
            }

        }

    }
}