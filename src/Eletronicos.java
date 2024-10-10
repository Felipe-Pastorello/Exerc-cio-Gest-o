public class Eletronicos extends Produto{

    public Eletronicos(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem){
        porcentagem /= 100;
        porcentagem += 0.15; //valor adicionado aos produtos eletronicos
        double desconto = preco * porcentagem;
        double valorFinal = preco - desconto;

        return valorFinal;
    }
}
