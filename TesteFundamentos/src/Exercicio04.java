import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o coeficiente a:"));
		double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o coeficiente b:"));
		double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o coeficiente c:"));
		
		// REGRA: o coeficiente "a" não pode ser 0
		if (a != 0) { 
			double delta = (b * b) - (4 * a * c);
			
			// REGRA: o Delta não pode ser negativo
			if (delta > 0 ) {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("X1 = " + x1 + "\nX2 = " + x2);
			}else {
				System.out.println("Impossível calcular");
			}
			
		} else {
			System.out.println("Impossível calcular");
		}
	}
}
