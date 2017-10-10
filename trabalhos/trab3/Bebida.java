package trab3;
import java.util.*;

public class Bebida {
    String nome;
    double teor,preco;
    int estoque,mls;

    public Bebida(){
        
    }

    public Bebida(String nome,double teor,int mls,double preco,int estoque) {
        this.nome=nome;
        this.teor=teor;
        this.mls=mls;
        this.preco=preco;
        this.estoque=estoque;
    }

    public void setEstoqueadc(int estoque){
        this.estoque+=estoque;
    }
    public void setVenda(int estoque){
        this.estoque-=estoque;
    }

}
