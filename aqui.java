import java.util.Scanner;

class aqui{
	public static void main(String[]args){
	int x;
	Scanner entrada=new Scanner(System.in);
	System.out.println("informe sua idade:");
	x=entrada.nextInt();
	boolean maiorD = x>=18;
		if (maiorD){
			System.out.println("maior de idade");
		}
		else{
			System.out.println("menor de idade");
		}
	}
}
