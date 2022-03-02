import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		
		double raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor de um raio para que seja possível "
				+ "informar a área do seu círculo"));
		double area = 3.14159 * (raio * raio);
		
		BigDecimal areaFormatada = new BigDecimal(area).setScale(4, RoundingMode.HALF_EVEN);
		System.out.println("A=" + areaFormatada.doubleValue());
	}
}
