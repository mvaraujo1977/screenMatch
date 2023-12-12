public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    public void exibeFichaTecnica(){

        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){

        somaAvaliacao += nota;
        totalDeAvaliacoes++;

    }

    public double obterMediaAvaliacao(){

        return somaAvaliacao/totalDeAvaliacoes;
    }

    public void imprime(){

        System.out.println(somaAvaliacao);
        System.out.println(totalDeAvaliacoes);
        System.out.println(obterMediaAvaliacao());
    }


}
