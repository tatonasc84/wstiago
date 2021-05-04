package decisao;

import javax.swing.JOptionPane;
import javax.swing.text.StyleConstants.CharacterConstants;

public class lista2Exercicios {

	public static void main(String[] args) {

		/*
		
		String cliente = JOptionPane.showInputDialog("Digite o nome do cliente").toUpperCase();
		Short diarias = Short.parseShort(JOptionPane.showInputDialog("Diarias: "));
		Short valor_diarias = 80;
		Double valor_total;
	
			
		
		if (diarias < 15) {
			valor_total=(valor_diarias * 8);
			

		}
		
		
		/*
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Diarias"));
		float taxa = (float) 5.5;
		if (diarias==15) {
			taxa = 6;
		}else if (diarias<15) {
			taxa = 8;
		}
		System.out.println("Total: " + ((80 + taxa) * diarias));
		*/
				
		
		/* EXERCICIO 2
		
				
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: " ));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo  numero: " ));
		char acao = JOptionPane.showInputDialog("Digite  o Simbolo aritimetico").charAt(0);
		int resposta; 
	
		if (acao =='+') {;
		resposta = (numero1 + numero2);
		System.out.println("Simbolo usado + a resposta e :" + resposta);
		
	}
	else if (acao =='-') {;
		resposta = (numero1 - numero2);
		System.out.println("Simbolo usado - a resposta e :" + resposta);
	}

	else if (acao =='*') {;
		resposta = (numero1 * numero2);
		System.out.println("Simbolo usado + a resposta e :" + resposta);
	}
	else if (acao =='/') {;
		resposta = (numero1 / numero2);
		System.out.println("Simbolo usado / a resposta e :" + resposta);
	}
	}
	FIM DO EXERCICIO 2*/
	

		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: " ));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo  numero: " ));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro  numero: "));
		
		if (numero1 < numero2 && numero1 <numero3) {
			System.out.println("Ordemdos numeros :" + numero1 + numero2 + numero3);
		
		 else (numero2 < numero1 && numero2 <numero3) 
			System.out.println("Ordemdos numeros :" + numero2 + numero2 + numero3);
	
		}
		}
		
}

}	



