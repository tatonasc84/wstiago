package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {


	public static void main (String [] args) {
		

			
		int numero = Integer.parseInt(JOptionPane.showInputDialog("N�mero"));
		int chute=0;
		int contador=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe:"));
			contador = contador + 1;
			// contador++;
			// contador+=1;
			if (chute>numero) {
				JOptionPane.showMessageDialog(null, "Chute um n�mero menor");
			}else if (chute<numero) {
				JOptionPane.showMessageDialog(null, "Chute um n�mero maior");
			}
		}while(numero!=chute);
		
		JOptionPane.showMessageDialog
			(null, "Parab�ns voc� acertou com " + contador + " tentativa(s)");


}
}