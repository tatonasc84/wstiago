package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {
	
	public static void main(String[] args) {
		
				String disciplina = JOptionPane.showInputDialog("Digite o nome da disciplina").toUpperCase();
		float nota1 =  Float.parseFloat(JOptionPane.showInputDialog ("Digite a primeira nota"));
		float nota8 =  Float.parseFloat(JOptionPane.showInputDialog ("Digite a segunda nota"));
		
		float nota3 = (nota1+nota8) /2;
		
			
		if (nota3 >=6) {
			System.out.println("PARABENS Voce foi aprovado na disciplina: " + disciplina);
		}
		
		
		else if (nota3 <=5.9 && nota3 >4) {
			System.out.println("VC esta de recuperacao: " + disciplina);
		}
		
		
		else if (nota3 >3.99) {
			System.out.println("PARABENS Voce REPROVADO: " + disciplina);
		}
		
		
		System.out.println("Disciplina: " + disciplina); 
		System.out.println("Sua nota media foi: " + nota3);
		
		
		
	}	
		
	}
	
		


