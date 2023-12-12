import br.com.marcelo.screenmach.modelos.Filme;

public class Principal {
    public static void main(String[] args) {

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



    }
}