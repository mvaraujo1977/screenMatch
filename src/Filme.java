public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaAvaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){

        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){

        somaAvaliacao += nota;
        totalDeAvaliacoes++;

    }

    double obterMediaAvaliacao(){

        return somaAvaliacao/totalDeAvaliacoes;
    }

    void imprime(){

        System.out.println(somaAvaliacao);
        System.out.println(totalDeAvaliacoes);
        System.out.println(obterMediaAvaliacao());
    }


}
