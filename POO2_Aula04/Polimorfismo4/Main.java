public class Main {

    public static void main(String[] args) {

        Caixa<String> caixaTexto = new Caixa<>();

        caixaTexto.guardar("Olá!");

        System.out.println(caixaTexto.pegar());

        Caixa<Integer> caixaNumero = new Caixa<>();

        caixaNumero.guardar(10);

        System.out.println(caixaNumero.pegar());
    }
}
