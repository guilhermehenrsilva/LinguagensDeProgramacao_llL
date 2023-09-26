import java.util.ArrayList;
import java.util.List;

public class Produtos {
    private String nome;
    private double precoCusto;
    private double margemLucro;
    private List<Impostos> impostos;

    public Produtos(String nome, double precoCusto,  double margemLucro) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.margemLucro = margemLucro;
        this.impostos = new ArrayList<>();
    }
    
    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public void insereImposto(Impostos imposto) {
        impostos.add(imposto);
    }

    public double calcularPrecoVenda() {
        double precoImpostos = impostos.stream().mapToDouble(imposto -> precoCusto * imposto.getPorcentagem())
                .sum(); // 

        double precoMargem = precoCusto + precoImpostos;
        double precoFinal = precoMargem + (precoMargem * margemLucro);

        return precoFinal;
    }

    public String imprimirImpostos() {
        StringBuilder linha = new StringBuilder();
        for (Impostos imposto : impostos) {
            linha.append(imposto.getNome()).append(",");
        }
        return linha.toString();
    }

    public void imprimeDadosProduto(double precoVenda) {
        System.out.println(nome);
        System.out.printf("Preco de custo: R$%.2f%n", precoCusto);
        System.out.println("Impostos: " + imprimirImpostos());
        System.out.printf("Preco de venda: R$%.2f%n%n", precoVenda);
    }
}