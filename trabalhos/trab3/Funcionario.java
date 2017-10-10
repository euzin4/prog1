package trab3;
import java.util.*;

public class Funcionario {
    Scanner scan=new Scanner(System.in);
    String nome,cpf,nasc,cargo;
    double salario;

    public Funcionario(String nome,String cpf,String nasc,String cargo,double salario){
        this.nome=nome;
        this.cpf=cpf;
        this.nasc=nasc;
        this.cargo=cargo;
        this.salario=salario;
    }
    
}
