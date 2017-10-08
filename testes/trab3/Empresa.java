package trab3;
import java.util.*;

public class Empresa{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        List<Funcionario> lista=new ArrayList<>();
        
        String nome;
        int idade;
        
        for(int i=0;i<3;i++){
            System.out.println("nome:");
            nome=scan.nextLine();
            System.out.println("idade:");
            idade=scan.nextInt();
            scan.nextLine();
            lista.add(new Funcionario(nome,idade));
        }
        
        for(Funcionario f:lista){
            System.out.println("\nnome:"+f.nome+"\nidade:"+f.idade);
        }
    }
}
