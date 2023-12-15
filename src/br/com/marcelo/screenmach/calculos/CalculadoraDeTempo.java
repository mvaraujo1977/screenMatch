package br.com.marcelo.screenmach.calculos;

import br.com.marcelo.screenmach.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;
    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo t){
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}