import java.util.Scanner;

class aqui{
	public static void main(String[]args){
	int x;
	Scanner entrada=new Scanner(System.in);
	System.out.println("informe sua idade:");
	x=entrada.nextInt();
		if (x>=18){
			System.out.println("maior de idade");
		}
		else{
			System.out.println("menor de idade");
		}
	}
}
