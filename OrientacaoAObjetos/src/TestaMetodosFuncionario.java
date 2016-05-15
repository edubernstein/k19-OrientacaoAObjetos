public class TestaMetodosFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.nome = "Eduardo Bernstein";
		f.salario = 1000;
		f.consultaFuncionario();
		f.aumentaSalario(15.5);
		f.consultaFuncionario();
	}
}
