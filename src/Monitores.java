public class Monitores extends Produto{

    public Monitores(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem){
        porcentagem /= 100;
        porcentagem += 0.3; //valor de desconto adicional dado aos monitres
        double desconto = preco * porcentagem;
        double valorFinal = preco - desconto;


        return valorFinal;
    }
}
