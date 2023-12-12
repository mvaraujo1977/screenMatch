import br.com.marcelo.screenmach.modelos.Filme;

public class Principal {
    public static void main(String[] args) {

        Filme filme = new Filme();

        filme.nome = "O Poderoso Chefão";
        filme.anoDeLancamento = 1970;
        filme.duracaoEmMinutos = 200;

        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);

        System.out.println("Soma das Avaliações: " +filme.getSomaAvaliacao());
        System.out.println("Total das Avaliações: " +filme.getTotalDeAvaliacoes());
        filme.imprime();



    }
}