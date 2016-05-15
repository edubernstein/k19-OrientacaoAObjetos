public class Funcionario {
	public String	nome;
	public double	salario;
	
	public void aumentaSalario(double valor) {
		this.salario += valor;
	}
	
	public void consultaFuncionario() {
		System.out.println("Dados do funcionário");
		System.out.println("Nome: " + nome);
		System.out.println("Salário: " + salario);
	}
}
