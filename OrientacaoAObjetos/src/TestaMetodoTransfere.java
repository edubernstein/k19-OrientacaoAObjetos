public class TestaMetodoTransfere {
	public static void main(String[] args) {
		System.out.println("Teste 1:");
		teste1();
		System.out.println("Teste 2:");
		teste2();
		System.out.println("Teste 2:");
		teste3();
	}
	
	private static void teste1() {
		Agencia a = new Agencia(1234);
		Conta origem = new Conta(a);
		origem.saldo = 1000;
		System.out.println("Saldo da primeira conta: " + origem.saldo);
		Conta destino = new Conta(a);
		destino.saldo = 1000;
		System.out.println("Saldo da segunda conta: " + destino.saldo);
		System.out.println("----------------------------------------");
		System.out.println("Realizando a transferência");
		origem.transfere(destino, 500);
		System.out.println("----------------------------------------");
		System.out.println("Saldo da primeira conta: " + origem.saldo);
		System.out.println("Saldo da segunda conta: " + destino.saldo);
	}
	
	private static void teste2() {
		Agencia a = new Agencia(1234);
		Conta origem = new Conta(a);
		origem.saldo = 1000;
		System.out.println("Saldo da primeira conta: " + origem.saldo);
		Conta destino = new Conta(a);
		destino.saldo = 1000;
		System.out.println("Saldo da segunda conta: " + destino.saldo);
		System.out.println("----------------------------------------");
		System.out.println("Realizando a transferência");
		origem.transfere2(destino, 500);
		System.out.println("----------------------------------------");
		System.out.println("Saldo da primeira conta: " + origem.saldo);
		System.out.println("Saldo da segunda conta: " + destino.saldo);
	}
	
	private static void teste3() {
		Agencia a = new Agencia(1234);
		Conta origem = new Conta(a);
		System.out.println("Saldo da primeira conta: " + origem.saldo);
		Conta destino = new Conta(a);
		System.out.println("Saldo da segunda conta: " + destino.saldo);
		System.out.println("----------------------------------------");
		System.out.println("Realizando a transferência");
		origem.transfere2(destino, 100);
		System.out.println("----------------------------------------");
		System.out.println("Saldo da primeira conta: " + origem.saldo);
		System.out.println("Saldo da segunda conta: " + destino.saldo);
	}
}