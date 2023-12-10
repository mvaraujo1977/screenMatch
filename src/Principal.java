public class Principal {
    public static void main(String[] args) {

        Filme filme = new Filme();

        filme.nome = "O Poderoso Chefão";
        filme.anoDeLancamento = 1970;
        filme.duracaoEmMinutos = 200;

        System.out.println(filme.nome);
        System.out.println(filme.anoDeLancamento);

    }
}