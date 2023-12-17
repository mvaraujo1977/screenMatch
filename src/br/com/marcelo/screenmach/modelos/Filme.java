package br.com.marcelo.screenmach.modelos;

import br.com.marcelo.screenmach.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public int getClassificavel() {
        return (int)obterMediaAvaliacao()/2;
    }
}
