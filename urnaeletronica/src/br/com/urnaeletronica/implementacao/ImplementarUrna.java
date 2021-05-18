package br.com.urnaeletronica.implementacao;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

import br.com.bankofoz.util.Magic;
import br.com.urnaeletronica.beans.Urna;
import br.com.urnaeletronica.beans.Voto;

public class ImplementarUrna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Urna urna = new Urna();
		urna.setSecao((Magic.i("secao")));
		urna.setZona((Magic.i("Zona")));
		
		/*List <Voto> lista= new ArrayList<Voto>();*/ 
		List<Voto> lista = new ArrayList<Voto>();
		do {
			lista.add(new Voto(
					Magic.i("Titulo"),
					Magic.s("Candidato"),
					Magic.s("Cargo"),
					(byte) Magic.i("Turno")
					));
		}while(Magic.b("Continuar?")==true);
		
		urna.setVotos(lista);
		
		int qtdeVotos1 =0;
		int qtdeVotosXpto =0;
		int qtdeVotosVereador =0;
		for (Voto voto : urna.getVotos()) {
			if (voto.getCargo().equalsIgnoreCase("VEREADOR")) {
				qtdeVotosVereador++;
			}
			
			if (voto.getTurno()==1) {
				qtdeVotosXpto++;
			}
			
			if  (voto.getTurno()==1) {
				qtdeVotosXpto++;
			}
				
			System.out.println("Votos do primeiro turno: " + qtdeVotos1);	
			System.out.println("Votos do candidato Xpto: " + qtdeVotosXpto);
			System.out.println("Votos para vereador: " + qtdeVotosVereador);
			System.out.println("Total de Votos: " + urna.getVotos().size());

			
			}
		}

	}

}
