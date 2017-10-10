package trab3;
import java.util.*;

public class Empresa{
    List<Funcionario> bodegueiros=new ArrayList<>();
    List<Bebida> produtos=new ArrayList<>();
    Scanner scan=new Scanner(System.in);
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        Empresa empresa=new Empresa();
        String nome_bodega="bodega do jaozin";
        double CNPJ=123456789;
        empresa.testefunc();
        empresa.testeprod();
        int opc;
 
        do{
            System.out.println("\n\tMENU\n1-Contratar funcionario\n2-Listar funcionario\n3-Vender bebida\n4-Listas bebidas\n5-Comprar bebidas\n9-sair");
            opc=scan.nextInt();
            switch(opc){
                case 1:
                    empresa.contrata();
                    break;
                case 2:
                    empresa.mostra();
                    break;
                case 3:
                    empresa.venda();
                    break;
                case 4:
                    empresa.mostraProd();
                    break;
                case 5:
                    empresa.compBeb();
                    break;
                case 9:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(opc!=9);
        
        
    }
    
    public void compBeb(){
        String nome;
        double teor,preco;
        int estoque,mls;
        int aux=0;
        
        System.out.print("Nome: ");
        nome=scan.nextLine();
        for(Bebida c:produtos){
            if(c.nome.equals(nome)){
                System.out.print("Quantidade: ");
                estoque=scan.nextInt();
                scan.nextLine();
                c.setEstoqueadc(estoque);
                aux=1;
            }
        }
        if(aux==0){
            System.out.print("Teor alcoolico: ");
            teor=scan.nextDouble();
            System.out.print("Preço: ");
            preco=scan.nextDouble();
            System.out.print("Quantidade: ");
            estoque=scan.nextInt();
            System.out.print("Volume/mls: ");
            mls=scan.nextInt();
            scan.nextLine();
            produtos.add(new Bebida(nome,teor,mls,preco,estoque));
        }
    }
    public void mostraProd(){
        System.out.println("\tESTOQUE");
        for(Bebida b1:produtos){
            System.out.println("\nBebida: "+b1.nome+"\nTeor alcoolico: "+b1.teor+"\nVolume: "+b1.mls+"mls"+"\nPreço: R$"+b1.preco+"\nEm estoque: "+b1.estoque+" unidade(s)");
        }
    }
    public void venda(){
        String auxnome;
        int aux=0;
        int aux1=0;
        boolean x=false;
        
        System.out.print("Digite o nome da bebida: ");
        auxnome=scan.nextLine();
        for(Bebida b:produtos){
            if(b.nome.equals(auxnome)){
                if(b.estoque>0){
                    x=true;
                    System.out.print("Quantidade: ");
                    aux1=scan.nextInt();
                    scan.nextLine();
                }
                if(b.estoque>=aux1){
                    if(x==true){
                        b.setVenda(aux1);
                    }else{
                        System.out.println("Estoque vazio!");
                    }
                }else{
                    System.out.println("Quantidade insuficiente");
                }
                aux=1;
                break;
            }
        }
        if(aux==0){
            System.out.println("Bebida nao encontrada!");
        }
    }
    public void testeprod(){
        String nome;
        double teor,preco;
        int estoque,mls;
        
        nome="cerveja lata";
        teor=4;
        mls=350;
        preco=2.5;
        estoque=15;
        produtos.add(new Bebida(nome,teor,mls,preco,estoque));
        nome="cachaca 51";
        teor=40;
        mls=700;
        preco=39.99;
        estoque=8;
        produtos.add(new Bebida(nome,teor,mls,preco,estoque));
        nome="amarula";
        teor=40;
        mls=750;
        preco=99.95;
        estoque=5;
        produtos.add(new Bebida(nome,teor,mls,preco,estoque));
    }
    public void testefunc(){
        String nome,cpf,nasc,cargo;
        double salario;
        //funcionarios
        nome="pedro";
        cpf="01923801291";
        nasc="25/06/1978";
        cargo="gerente";
        salario=1800;
        bodegueiros.add(new Funcionario(nome,cpf,nasc,cargo,salario));
        nome="beatriz";
        cpf="98213791832";
        nasc="09/11/1996";
        cargo="caixa";
        salario=1500;
        bodegueiros.add(new Funcionario(nome,cpf,nasc,cargo,salario));
        nome="julio";
        cpf="92739183945";
        nasc="11/09/1992";
        cargo="garcom";
        salario=1300;
        bodegueiros.add(new Funcionario(nome,cpf,nasc,cargo,salario));
    }
    public void contrata(){
        Scanner scan=new Scanner(System.in);
        String nome,cpf,nasc,cargo;
        double salario;
        
        System.out.print("Nome: ");
        nome=scan.nextLine();
        System.out.print("CPF: ");
        cpf=scan.nextLine();
        System.out.print("Data de nascimento: ");
        nasc=scan.nextLine();
        System.out.print("Cargo: ");
        cargo=scan.nextLine();
        System.out.print("Salário: ");
        salario=scan.nextDouble();
        bodegueiros.add(new Funcionario(nome,cpf,nasc,cargo,salario));
    }
    public void mostra(){
        int tam=bodegueiros.size();
        if (tam==0){
            System.out.println("\nLista vazia!");
        }else{
            System.out.println("FUNCIONARIOS:");
            int i=0;
            for(Funcionario f:bodegueiros){
                i++;
                System.out.println("\nFuncionario "+i+"\nNome: "+f.nome+"\nCPF: "+f.cpf+"\nData de nascimento: "+f.nasc+"\nCargo: "+f.cargo+"\nSalario: "+f.salario);
            }
        }
    }
}
