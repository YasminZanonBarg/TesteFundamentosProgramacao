import javax.swing.JOptionPane;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		int produtos = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos tipos de produtos você vai comprar?"));
		double pagar = 0;
		
		for(int laco = produtos; produtos > 0; produtos--){
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o código do produto:"));
			int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade do produto:"));
			double precoUnitario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o preço do produto:"));
			double precoTotal = precoUnitario * quantidade;
			pagar = pagar + precoTotal;
		}
		System.out.println("VALOR A PAGAR: R$ " + Math.round(pagar*100.0)/100.0);
	}
}
	
