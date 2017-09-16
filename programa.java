public class programa{
	public static void main(String[]args){
		Conta minhaConta = new Conta();
		minhaConta.dono="nome aqui";
		minhaConta.saldo=5000;
		minhaConta.numero=1234567890;
		System.out.println("dono: "+minhaConta.dono);
		
		System.out.println(minhaConta.saldo);
		minhaConta.depositar(800.8);
		System.out.println(minhaConta.saldo);
	}
}
