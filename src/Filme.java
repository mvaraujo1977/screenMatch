public class Filme {
    public String nome;
    public int anoDeLancamento;
    public boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacoes;
    public int duracaoEmMinutos;


    public double getSomaAvaliacao(){

        return somaAvaliacao;

    }
    public int getTotalDeAvaliacoes(){

        return totalDeAvaliacoes;

    }

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

        System.out.println("Média da Avaliação: "+obterMediaAvaliacao());
    }


}
