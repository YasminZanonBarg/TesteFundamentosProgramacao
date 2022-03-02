import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
	
		int qtdEntradas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de valores a serem lidos: "));
		
		int out = 0;
		int in = 0;
		
		for (int laco = 0; laco < qtdEntradas; laco++) {
			
			double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o " + (laco + 1) + " número:"));
			
			if(valor >= 10 && valor <= 20) {
				in ++;
			} else {
				out++;
			}
			
		}
		
		System.out.println(in + " in\n" + out + " out");
	}

}
