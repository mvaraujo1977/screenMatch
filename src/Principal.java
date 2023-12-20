import br.com.marcelo.screenmach.calculos.CalculadoraDeTempo;
import br.com.marcelo.screenmach.calculos.FiltroRecomendacao;
import br.com.marcelo.screenmach.modelos.Episodio;
import br.com.marcelo.screenmach.modelos.Filme;
import br.com.marcelo.screenmach.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        System.out.println("*************** Filme *****************************");
        Filme filme = new Filme();

        filme.setNome("O Poderoso Chefão");
        filme.setAnoDeLancamento(1970);
        filme.setDuracaoEmMinutos(200);


        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);

        System.out.println("Soma das Avaliações: " +filme.getSomaAvaliacao());
        System.out.println("Total das Avaliações: " +filme.getTotalDeAvaliacoes());
        filme.imprime();
        System.out.println("Duração do filme: "+filme.getDuracaoEmMinutos());

        System.out.println("******************* Serie *************************");

        Serie serie = new Serie();
        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duração da Série: "+serie.getDuracaoEmMinutos());

        System.out.println("******************* calculadora *************************");

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(180);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);

        System.out.println(calculadora.getTempoTotal());

        System.out.println("******************* recomentadacao *************************");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


        var filmeDoPaulo = new Filme();

        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setNome("DogVille");
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        System.out.println("******************* ARRAY *************************");

        //Criando um array()

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(filmeDoPaulo);

        System.out.println("Total de filme " + listaDeFilmes.size() );
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());











    }
}