package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		String email = "T1Ag0.a.NasC1m3nT01@ITAU-uniBAnco.COM.br";
		System.out.println("Original: " + email);
		System.out.println("Minusculo: " + email.toLowerCase());
		System.out.println("Maiusculo: " + email.toUpperCase());
		System.out.println("Qtde de caracteres: " + email.length());
		System.out.println("tem arroba? " + email.contains("@"));
		System.out.println("Posicao do @: " + email.indexOf("@"));
		System.out.println("Do terceiro ate o quinto: " + email.substring(1,5));
		System.out.println("Do terceiro ate a fim: " + email.substring(2));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2).toLowerCase());
		//system.out.println("Usuario do email: " + email.substring(0, email.indexOf("@")));
		System.out.println("exibindo o sevidor: " + email.substring(email.indexOf("@")+1).toUpperCase());
		System.out.println("Primeiro caracter: " +email.charAt(0) );
		System.out.println("E igual: " + email.equals("T1Ag0.a.NasC1m3nT0@ITAU-uniBAnco.COM.br"));





	}

}
