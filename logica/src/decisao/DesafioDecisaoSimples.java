package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {
	
	public static void main(String[] args) {
		
		
		
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome").toUpperCase();
		short idade =  Short.parseShort(JOptionPane.showInputDialog("Digite sua idade"));
		
		
		if (idade < 16) {
			System.out.println(nome  + " Vai tomar leite: " + idade);
			
		}
		
				
		else if (idade >=18 && idade < 70) {
			System.out.println(nome + " SEu voto � obrigatorio: " + idade);
		}
		
				
		else if (idade==16 || idade==17 || idade>70) {
			System.out.println(nome + " SEu voto � Facultativo: " + idade);
		}
		
	
		
		
	}

}
