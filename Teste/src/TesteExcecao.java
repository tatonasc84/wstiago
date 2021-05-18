import javax.swing.JOptionPane;

import br.com.teste.excecao.MinhaExcecao;

public class TesteExcecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
		
		int numero = Integer.parseInt("7");
		System.out.println("Numero: " + numero);
		

		String  palavra="";
		System.out.println("Qtde letras:" + palavra.length());
		
			
	/*
		int numeros []  = new int[2];
		numeros[0]=150;
		numeros[1]=23;
		numeros[2]=10; */
		
		String palavras []  = new String [10];
		int indice = 0;
		do {
			palavras [indice] = JOptionPane.showInputDialog("Digite uma palavra");
			indice ++;
		}while (JOptionPane.showConfirmDialog
				(null, "Continuar?", "Vetores", JOptionPane.YES_NO_OPTION)==0);
		System.out.println(palavras);
		for (int contador=0;contador<indice;contador++) {
			System.out.println("Palavras nº: " + (contador+1) + ": " + palavras[contador]);
		}

		
		
		}
				
		/* catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println("Vetor estourou");
		}
				
				
		catch (NullPointerException e ) {
			System.out.println("Objeto nullo");
		}
		
		catch (NumberFormatException e ) {
		System.out.println("Numero invalido");
		
	} */
		catch (Exception e) {
		System.out.println(MinhaExcecao.tratar(e));
			}
		/*finally {
			System.out.println("Volte sempre");
			
		}*/

}
}