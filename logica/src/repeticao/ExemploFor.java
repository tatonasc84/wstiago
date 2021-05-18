package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {
	
	public static void main(String[] args) {
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("tabuada"));
				for  (int cont=0; cont<11; cont+=1) {
			System.out.println(tabuada + " x " + cont +  " = " + (tabuada*cont));
			
		}
	}

}
