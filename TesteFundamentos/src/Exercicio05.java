import javax.swing.JOptionPane;

public class Exercicio05 {
	public static void main(String[] args) {
		int senhaPadrao = 2002;
		
		double senha = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a senha correta:"));
		
		do {
			System.out.println("Senha Invalida");
			senha = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a senha correta:"));
			
		} while (senha != senhaPadrao);
		
		System.out.println("Acesso Permitido");
		
	}
}
