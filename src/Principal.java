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

        filme.imprime();



    }
}