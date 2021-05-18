package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.modelo.Curso;
import br.com.unixyz.modelo.Endereco;
import br.com.unixyz.modelo.Professor;
import br.com.unixyz.modelo.Turma;

public class ImplementarTurma {
	
	
	

	public static void main (String[] args) {
	
	Turma  turma = new Turma(
			1,
			"Turma18C",
			"Diurno",
			new  Aluno(
					123,
					"Nome Aluno",
					"Email ALuno",
					"1234-4567",
					"12345678910",
					new Endereco(
							"log",
							"Bairro",
							"Cidade",
							"Estado",
							"CEP",
							"numero",
							"Complemento"
							
							)
					
					),
			new Professor(
				"prof",
				"titulacao",
				5000,
				new Endereco(
						"log",
						"Bairro",
						"Cidade",
						"Estado",
						"CEP",
						"numero",
						"Complemento"
						)
					),
			new Curso(
					"Descricao",
					"Sigla",
					"982045048",
					5000,
					"Formacao"
					)						
			);
	
		
	System.out.println("Professor: "+ turma.getProfessor().getNome());
	System.out.println("Aluno: " + turma.getAluno().getNome());
	System.out.println ("Cidade: " + turma.getAluno().getEndereco().getCidade());
	System.out.println("Curso: " + turma.getCurso().getDescricao());
	System.out.println("Turma: " + turma.getNome());
		
	}

}
