package repeticao;

import javax.swing.JOptionPane;


public class DesafioSlide77 {

	public static void main (String [] args) {

		
		int contador1=0;
		int contador2=0;
		int contador3=0;	
		String escolaridade = "";
		do {
			
			escolaridade = JOptionPane.showInputDialog("Digite a escolaridade: medio, superior ou pos").toLowerCase();

			if (escolaridade.equals("medio")){
				contador1=contador1+1;
			}

			else if (escolaridade.equals("superior")) {
				contador2=contador2+1;
			}

			else if (escolaridade.equals("pos")) {
				contador3=contador3+1;
			}



		}	while (escolaridade.equals("medio") || escolaridade.equals("superior") || escolaridade.equals("pos"));
		if (contador1>contador2 && contador1>contador3) {
			System.out.println("Medio: " + contador1);
		}

		else if (contador2>contador1 && contador2>contador3) {
			System.out.println("superior: " + contador2);
		}

	
	if (contador3>contador2 && contador3>contador1) {
		System.out.println("pos: " + contador3);
	}

	}

}

