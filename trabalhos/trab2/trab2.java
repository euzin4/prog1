package trab2;
import java.util.Scanner;

public class trab2 {
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        int opc;
        double aux;
        
        Conta minhaConta = new Conta();
        conta1 outraConta = new conta1();
        do{
            System.out.println("1-Consultar saldo");
            System.out.println("2-Efetuar saque");
            System.out.println("3-Efetuar deposito");
            System.out.println("4-Efetuar transferência");
            System.out.println("5-Exibir dados da conta");
            System.out.println("0-sair");
            opc=entrada.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Saldo minha conta: "+minhaConta.saldo);
                    System.out.println("Saldo outra conta:"+outraConta.saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: ");
                    aux=entrada.nextDouble();
                    if(aux>minhaConta.saldo){
                        System.out.println("Saldo insuficiente");
                    }else{
                        minhaConta.saldo-=aux;
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor a ser depositado: ");
                    aux=entrada.nextDouble();
                    minhaConta.saldo+=aux;
                    break;
                case 4:
                    System.out.println("1-minha conta para outra conta");
                    System.out.println("2-outra conta para minha conta");
                    opc=entrada.nextInt();
                    switch(opc){
                        case 1:
                            System.out.println("digite o valor a ser transferido");
                            aux=entrada.nextInt();
                            minhaConta.saldo-=aux;
                            outraConta.saldo+=aux;
                            break;
                        case 2:
                            System.out.println("digite o valor a ser transferido");
                            aux=entrada.nextInt();
                            outraConta.saldo-=aux;
                            minhaConta.saldo+=aux;
                            break;
                        default:
                            System.out.println("erro");
                            break;
                     
                    }
                case 5:
                    System.out.println("numero: "+minhaConta.numero_conta);
                    System.out.println("dono: "+minhaConta.dono);
                    System.out.println("saldo: "+minhaConta.saldo+"\n");
                    System.out.println("numero: "+outraConta.numero_conta);
                    System.out.println("dono: "+outraConta.dono);
                    System.out.println("saldo: "+outraConta.saldo+"\n");
                    break;
                default:
                    System.out.println("Ate logo!");
                    break;
            }
        }while(opc!=0);
    }
}