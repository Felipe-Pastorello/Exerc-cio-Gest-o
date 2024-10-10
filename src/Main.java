import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();
        Eletronicos celular = new Eletronicos("Celular", 3000);
        Produto placa = new Produto("Placa de vídeo",1800);
        Eletronicos microondas = new Eletronicos("Micro-ondas", 500);
        Monitores monitor =  new Monitores("Monitor", 350);

        System.out.println("Informe o valor de desconto:");
        double porcentagem = scanner.nextDouble();

        estoque.adicionarProduto(celular);
        estoque.adicionarProduto(placa);
        estoque.adicionarProduto(microondas);
        estoque.adicionarProduto(monitor);

        estoque.exibirPrecosComDesconto(porcentagem);
    }
}