package variaveis;

import javax.swing.JOptionPane;

public class TipolsDadosDesafio {

	public static void main(String[] args) {
	
		String nome = JOptionPane.showInputDialog("Digite o nome do produto");
		double valorcompra = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de compra do produto"));
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtde do produto"));
			double valoreimposto = (valorcompra * 1.2); 

		
		
		
System.out.println("Nome: " + nome);
System.out.println("Qtde de produtos: " + qtde);
System.out.println("valor de venda: " + valoreimposto);
System.out.println("valor sem imposto: " + valorcompra);	
		
		
		
		
		
	}
	
}
