public class TestaTurma {
	public static void main(String[] args) {
		Turma t1 = new Turma();
		t1.periodo = "Matutino";
		t1.serie = 1;
		t1.sigla = "M1";
		t1.tipoDeEnsino = "Fundamental I";
		Turma t2 = new Turma();
		t2.periodo = "Vespertino";
		t2.serie = 2;
		t2.sigla = "V2";
		t2.tipoDeEnsino = "Fundamental II";
		System.out.println("Dados da primeira turma");
		System.out.println("Período: " + t1.periodo);
		System.out.println("Série: " + t1.serie);
		System.out.println("Sigla: " + t1.sigla);
		System.out.println("Tipo de Ensino: " + t1.tipoDeEnsino);
		System.out.println("-----------------------");
		System.out.println("Dados da segunda turma");
		System.out.println("Período: " + t2.periodo);
		System.out.println("Série: " + t2.serie);
		System.out.println("Sigla: " + t2.sigla);
		System.out.println("Tipo de Ensino: " + t2.tipoDeEnsino);
	}
}
