import java.util.*;
public class Programa{
	public static void main(String[] args){
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		Scanner le = new Scanner(System.in);
		
		int op, idade;
		String nome;
		float peso;

		do{
			System.out.println("\n\n\tO que deseja fazer?");
			System.out.println("1)Cadastrar uma pessoa");
			System.out.println("2)Listar pessoas");
			System.out.println("3)Sair");
			op = le.nextInt();
			switch(op){
				case 1:
					le.nextLine();
					System.out.printf("\33[2J");
					System.out.println("Nome: ");
					nome = le.nextLine();
					System.out.println("Idade: ");
					idade = le.nextInt();
					System.out.println("Peso: ");
					peso = le.nextFloat();
					pessoas.add(new Pessoa(idade, nome, peso));
					System.out.printf("\33[2J");
					break;
				case 2:
					System.out.printf("\33[2J");
					for(Pessoa p : pessoas)
						System.out.println(p.getInfos());
					break;
				case 3:
					break;
				default:
						System.out.println("Valor inválido!");	
			}
		}while(op != 3);

		
	}

}
