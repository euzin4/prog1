import java.util.Scanner;

public class Programa{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Conta minhaConta;

		minhaConta = new Conta();
		System.out.print("digite o nome do titular dessa conta: ");
		minhaConta.dono = entrada.nextLine();
		System.out.print("digite o saldo inicial da conta: ");
		minhaConta.saldo = entrada.nextDouble();
		System.out.println("\nTitular: "+minhaConta.dono);
		System.out.println("Saldo: "+minhaConta.saldo);
		minhaConta.saca(500);
		minhaConta.deposita(100);
		System.out.printf("Saldo: %.2f\n\n",minhaConta.saldo);
	}
}