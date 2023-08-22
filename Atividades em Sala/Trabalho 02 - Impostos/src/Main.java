
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Impostos icms = new Impostos("ICMS", 0.07);
		Impostos confins = new Impostos("Confins", 0.12);
		Impostos ipi = new Impostos("IPI", 0.08);
		Impostos iss = new Impostos("ISS", 0.05);
		Impostos cide = new Impostos("Cide", 0.10);
		Impostos csll = new Impostos("CSLL", 0.04);
        
        List<Produtos> prod = new ArrayList<>();
        
        Produtos arroz = new Produtos("Arroz", 7.00, 0.20);
        arroz.insereImposto(icms);
        arroz.insereImposto(confins);
        arroz.insereImposto(iss);
        
        Produtos feijao = new Produtos("Feijão", 7.00, 0.25);
        feijao.insereImposto(icms);
        feijao.insereImposto(confins);
        feijao.insereImposto(iss);
        
        Produtos carne = new Produtos("Carne", 7.00, 0.35);
        carne.insereImposto(confins);
        carne.insereImposto(icms);
        carne.insereImposto(ipi);
        
        Produtos cerveja = new Produtos("Cerveja", 7.00, 0.30);
        cerveja.insereImposto(confins);
        cerveja.insereImposto(icms);
        cerveja.insereImposto(iss);
        cerveja.insereImposto(ipi);
        
        Produtos gas = new Produtos("Gás", 7.00, 0.15);
        gas.insereImposto(confins);
        gas.insereImposto(icms);
        gas.insereImposto(ipi);
        
        Produtos gasolina = new Produtos("Gasolina", 7.00, 0.15);
        gasolina.insereImposto(confins);
        gasolina.insereImposto(icms);
        gasolina.insereImposto(cide);
        
        prod.add(arroz);
        prod.add(feijao);
        prod.add(carne);
        prod.add(cerveja);
        prod.add(gas);
        prod.add(gasolina);
        
        for(Produtos produto : prod) {
        	double precoVenda = produto.calcularPrecoVenda();
        	produto.imprimeDadosProduto(precoVenda);
        }
	}

}
