import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int produtos = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o código do produto:"));
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade desse produto:"));
		
		String descricao;
		double valor, totalConta;
		
		switch(produtos) {
			case 1:
				descricao = "Cachorro Quente";
				valor = 4.00;
				totalConta = valor * quantidade;
				System.out.println("Total: R$ " + totalConta);
				break;
			case 2:
				descricao = "X-Salada";
				valor = 4.50;
				totalConta = valor * quantidade;
				System.out.println("Total: R$ " + totalConta);
				break;
			case 3:
				descricao = "X-Bacon";
				valor = 5.00;
				totalConta = valor * quantidade;
				System.out.println("Total: R$ " + totalConta);
				break;
			case 4:
				descricao = "Torrada Simples";
				valor = 2.00;
				totalConta = valor * quantidade;
				System.out.println("Total: R$ " + totalConta);
				break;
			case 5:
				descricao = "Refrigerante";
				valor = 1.50;
				totalConta = valor * quantidade;
				System.out.println("Total: R$ " + totalConta);
				break;
		}
	}
}
