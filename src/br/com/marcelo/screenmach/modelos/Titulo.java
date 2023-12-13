package br.com.marcelo.screenmach.modelos;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;


    public double getSomaAvaliacao() {
        return somaAvaliacao;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }



    public void exibeFichaTecnica() {

        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota) {

        somaAvaliacao += nota;
        totalDeAvaliacoes++;

    }

    public double obterMediaAvaliacao() {

        return somaAvaliacao / totalDeAvaliacoes;
    }

    public void imprime() {

        System.out.println("Média da Avaliação: " + obterMediaAvaliacao());
    }

}
