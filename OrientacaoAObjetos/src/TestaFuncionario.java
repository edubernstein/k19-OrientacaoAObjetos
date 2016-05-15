public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Eduardo Bernstein";
		f1.salario = 1000;
		Funcionario f2 = new Funcionario();
		f2.nome = "Marcelo Martins";
		f2.salario = 2000;
		System.out.println("Dados do primeiro funcionário");
		System.out.println("Nome: " + f1.nome);
		System.out.println("Salário: " + f1.salario);
		System.out.println("-----------------------");
		System.out.println("Dados do segundo funcionário");
		System.out.println("Nome: " + f2.nome);
		System.out.println("Salário: " + f2.salario);
	}
}
