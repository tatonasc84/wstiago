package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	
	public static void main (String [] args) {
		

		
		String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
		while (nome.length()<=3 || nome.length()>=15) {
			nome = JOptionPane.showInputDialog("Digite o nome novamente").toUpperCase();
			}
	
		System.out.println("Nome: " + nome);
	}
}
