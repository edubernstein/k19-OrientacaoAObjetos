public class TesteAlunoETurma {
	public static void main(String[] args) {
		Aluno a = new Aluno();
		Turma t = new Turma();
		a.nome = "Eduardo Bernstein";
		a.rg = "123456789";
		a.dataDeNascimento = "14/12/1976";
		t.periodo = "Noturno";
		t.serie = 1;
		t.sigla = "N1";
		t.tipoDeEnsino = "Pós-Graduação";
		a.turma = t;
		System.out.println("Dados da turma");
		System.out.println("Período: " + t.periodo);
		System.out.println("Série: " + t.serie);
		System.out.println("Sigla: " + t.sigla);
		System.out.println("Tipo de Ensino: " + t.tipoDeEnsino);
		System.out.println("---------------------------");
		System.out.println("Dados do aluno e turma");
		System.out.println("Nome: " + a.nome);
		System.out.println("RG: " + a.rg);
		System.out.println("Data de nascimento: " + a.dataDeNascimento);
		System.out.println("Período: " + a.turma.periodo);
		System.out.println("Série: " + a.turma.serie);
		System.out.println("Sigla: " + a.turma.sigla);
		System.out.println("Tipo de Ensino: " + a.turma.tipoDeEnsino);
	}
}
