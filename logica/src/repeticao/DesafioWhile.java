package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {
	
	
	
	public static void main (String [] args) {
	/*
		byte dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia do nascimento"));
		byte mes = Byte.parseByte(JOptionPane.showInputDialog("Digite o mes  do nascimento "));
		byte ano = Byte.parseByte(JOptionPane.showInputDialog("Digite o ano  do nascimento "));
		
		
		while (ano>=2003 || ano<=1952) {
			ano = JOptionPane.showInputDialog("Digite o ano novamente");
			}
	
		
		while (mes.length()<1 || mes.length()>=12) {
			ano = JOptionPane.showInputDialog("Digite o mes novamente");
			}
		
		
		while (dia.length()<1 || dia.length()>=31) {
			ano = JOptionPane.showInputDialog("Digite o dia novamente");
			}
		
		System.out.println("Dia de Nascimento" + dia );
		System.out.println("Mes de Nascimento" + mes);
		System.out.println("Ano de Nascimento" + ano );
		*/
		
		
		byte dia = Byte.parseByte(JOptionPane.showInputDialog("Dia: "));
		byte mes = Byte.parseByte(JOptionPane.showInputDialog("Mes"));
		short ano = Short.parseShort(JOptionPane.showInputDialog("Ano"));
		
		while(ano>=2003 || ano<=1952) {
			ano = Short.parseShort(JOptionPane.showInputDialog("Ano novamente"));
		}
		
		while (mes<1 || mes>12) {
			mes = Byte.parseByte(JOptionPane.showInputDialog("Mes novamente"));
		}
		
		if (mes==2) {
			while(dia<1 || dia>29) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dia novamente: "));
			}
		}else if (mes==4 || mes==6 || mes==9 || mes==11) { //meses com 30 dias
			while(dia<1 || dia>30) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dia novamente: "));
			}
		}else { // meses com 31 dias
			while(dia<1 || dia>31) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dia novamente: "));
			}
		}
		
		System.out.println("Data: " + dia + "/" + mes + "/" + ano);
		
	}
}
