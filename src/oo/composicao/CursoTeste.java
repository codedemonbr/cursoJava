package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");

		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");

		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		curso1.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso2);
		aluno2.adicionarCurso(curso2);
		aluno2.adicionarCurso(curso3);

		for (Aluno aluno : curso1.alunos) {
			System.out.println("Estou matriculado no curso " + curso1.nome + " ... ");

			System.out.println("... e o meu nome é " + aluno.nome);
			System.out.println();
		}
		
		for (Curso curso : aluno1.cursos) {
			System.out.println("Eu sou o aluno "+ aluno1.nome);
			System.out.println(" e estou matriculado em  "+ curso.nome);
			System.out.println();
		}
		
		for (Aluno aluno : curso2.alunos) {
			System.out.println("Estou matriculado no curso " + curso1.nome + " ... ");

			System.out.println("... e o meu nome é " + aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno2.cursos.get(2).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("java completo");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}

	}

}
