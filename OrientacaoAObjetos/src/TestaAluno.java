public class TestaAluno {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.nome = "Eduardo Bernstein";
		a1.rg = "123456";
		a1.dataDeNascimento = "14/12/1976";
		Aluno a2 = new Aluno();
		a2.nome = "Marcelo Martins";
		a2.rg = "987654";
		a2.dataDeNascimento = "01/01/1975";
		System.out.println("Dados do primeiro aluno");
		System.out.println("Nome: " + a1.nome);
		System.out.println("RG: " + a1.rg);
		System.out.println("Data de nascimento: " + a1.dataDeNascimento);
		System.out.println("-----------------------");
		System.out.println("Dados do segundo aluno");
		System.out.println("Nome: " + a2.nome);
		System.out.println("RG: " + a2.rg);
		System.out.println("Data de nascimento: " + a2.dataDeNascimento);
	}
}
