public class Conta {
	public int		numero;
	public double	saldo;
	public double	limite	= 100;
	public String	gerente;
	public Agencia	agencia;
	
	public Conta(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public void imprimeExtrato() {
		System.out.println("SALDO: " + this.saldo);
	}
	
	public double consultaSaldoDisponivel() {
		return this.saldo + this.limite;
	}
	
	public void transfere(Conta destino, double valor) {
		this.saldo -= valor;
		destino.saldo += valor;
	}
	
	public void transfere2(Conta destino, double valor) {
		destino = new Conta(new Agencia(456));
		this.saldo -= valor;
		destino.saldo += valor;
	}
}
